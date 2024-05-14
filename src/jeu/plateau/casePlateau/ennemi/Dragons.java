package jeu.plateau.casePlateau.ennemi;

public class Dragons implements Ennemi {
    private int health;

    public Dragons(int health) {
        this.health = health;
    }

    // Méthode pour infliger des dégâts au dragon
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // Assurez-vous que la santé du dragon ne devienne pas négative
        }
    }

    // Méthode pour récupérer les points de vie actuels du dragon
    public int getHealth() {
        return health;
    }

    @Override
    public String afficher() {
        return "D"; // "D" représente un dragon sur le plateau
    }
}
