package jeu.lancement;

import jeu.personnages.Personnage;

import java.sql.*;
import java.util.List;

public class DataBase {
    private String HOSTNAME;
    private String DBNAME;
    private String USERNAME;
    private String PWD;

    public DataBase() {
        this.HOSTNAME = "localhost";
        this.DBNAME = "donjon-dragon";
        this.USERNAME = "Andrea";
        this.PWD = "HelioS@@du26";
    }

    public String getHostname() {
        return this.HOSTNAME;
    }

    public String getDBName() {
        return this.DBNAME;
    }

    public String getUsername() {
        return this.USERNAME;
    }

    public String getPwd() {
        return this.PWD;
    }

    public String getUrl() {
        return "jdbc:mariadb://" + this.HOSTNAME + "/" + this.DBNAME;
    }

    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(getUrl(), getUsername(), getPwd());
            System.out.println("Connexion réussie à la base de données.");
        } catch (SQLException e) {
            System.err.println("Échec de la connexion à la base de données : " + e.getMessage());
            throw e; // Relancer l'exception pour que l'appelant puisse la gérer
        }
        return connection;
    }

    public void getHero() throws SQLException {
        String req = "SELECT Nom FROM Hero"; // Sélectionnez uniquement le nom
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(req);
             ResultSet res = stmt.executeQuery()) {
            while (res.next()) {
                System.out.println(res.getString("Nom"));
            }
        } catch (SQLException ex) {
            // Gérer l'exception (par exemple, en affichant un message d'erreur)
            ex.printStackTrace();
        }
    }


    public void setHero() throws SQLException {
        String req = "SELECT * FROM Hero";
    }


    public void createHero(Personnage personnage) throws SQLException {
        String req = "INSERT INTO Hero (Type, Nom, NiveauVie, NiveauForce, Offensif, Defensif) VALUES (?,?,?,?,?,?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(req)) {
            preparedStatement.setString(1, personnage.getType());
            preparedStatement.setString(2, personnage.getName());
            preparedStatement.setInt(3, personnage.getPv());
            preparedStatement.setInt(4, personnage.getDamage());

            if (personnage.getEquipementOffensif() != null) {
                preparedStatement.setString(5, personnage.getEquipementOffensif());
            } else {
                preparedStatement.setNull(5, Types.VARCHAR);
            }
            if (personnage.getEquipementDefensif() != null) {
                preparedStatement.setString(6, personnage.getEquipementDefensif());
            } else {
                preparedStatement.setNull(6, Types.VARCHAR);
            }
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'exécution de la requête : " + e.getMessage());
            throw e;
        }
    }

    public void updateHero(Personnage personnage) throws SQLException {
        String req = "UPDATE Hero SET Type = ?, NiveauVie = ?, NiveauForce = ?, Offensif = ?, Defensif = ? WHERE Nom = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(req)) {
            preparedStatement.setString(1, personnage.getType());
            preparedStatement.setInt(2, personnage.getPv());
            preparedStatement.setInt(3, personnage.getDamage());

            if (personnage.getEquipementOffensif() != null) {
                preparedStatement.setString(4, personnage.getEquipementOffensif());
            } else {
                preparedStatement.setNull(4, Types.VARCHAR);
            }
            if (personnage.getEquipementDefensif() != null) {
                preparedStatement.setString(5, personnage.getEquipementDefensif());
            } else {
                preparedStatement.setNull(5, Types.VARCHAR);
            }
            preparedStatement.setString(6, personnage.getName());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'exécution de la requête : " + e.getMessage());
            throw e;
        }
    }

    void updateHeroInDatabase(String oldName, String newName, String type) throws SQLException {
        String updateQuery = "UPDATE Hero SET Nom = ?, Type = ? WHERE UPPER(Nom) = ?";
        try (Connection conn = this.getConnection();
             PreparedStatement stmt = conn.prepareStatement(updateQuery)) {
            stmt.setString(1, newName);
            stmt.setString(2, type);
            stmt.setString(3, oldName);
            stmt.executeUpdate();
        }
    }
    boolean isHeroExists(String name) throws SQLException {
        String query = "SELECT COUNT(*) FROM Hero WHERE UPPER(Nom) = ?";
        try (Connection conn = this.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
}
