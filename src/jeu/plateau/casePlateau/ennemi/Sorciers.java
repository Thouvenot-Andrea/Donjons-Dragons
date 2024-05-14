package jeu.plateau.casePlateau.ennemi;

public class Sorciers extends Ennemi {
    public Sorciers(int health) {
        super(health);
    }
    @Override
    public String afficher() {
        return "Sorcier";
    }
}

