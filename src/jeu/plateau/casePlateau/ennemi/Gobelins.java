package jeu.plateau.casePlateau.ennemi;

public class Gobelins extends Ennemi {
    public Gobelins(int health) {
        super(health);
    }

    @Override
    public String afficher() {
        return "Gobelin";
    }
}