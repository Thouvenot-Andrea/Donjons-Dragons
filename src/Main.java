import jeu.PersonnageHorsPlateauException;
import jeu.lancement.DataBase;
import jeu.lancement.Game;
import jeu.lancement.Menu;
import jeu.personnages.Personnage;
import jeu.plateau.Plateau;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException, SQLException {

        Menu menu = new Menu();
        menu.display("Bienvenue dans Donjons & Dragons !");

        boolean replay = true;
        while (replay) {

            Plateau plateau = new Plateau();
            Personnage personnage = menu.menuGame();
            Game game = new Game(plateau, personnage, menu);
            game.play();

            menu.restart("Voulez-vous rejouer ? (yes or no)");
            String response = menu.getUserInput();

            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                replay = true;
            } else {
                replay = false;
                menu.thanks("Merci d'avoir joué :)");
            }
        }
    }
}







