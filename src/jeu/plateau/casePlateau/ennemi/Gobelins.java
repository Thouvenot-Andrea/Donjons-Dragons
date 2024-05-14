package jeu.plateau.casePlateau.ennemi;

import jeu.personnages.Personnage;

public class Gobelins implements CaseEnnemi {
    private int health;

    public Gobelins(int health) {
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
        return "Gobelins"; //
    }

    @Override
    public String interagir(Personnage hero) {
        return "";
    }
}
