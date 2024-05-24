package jeu.plateau.casePlateau.ennemi;

public class Sorciers extends Ennemi {

    private static int getPv = 9;

    public Sorciers() {
        super(getPv);
    }

    @Override
    public String afficher() {
        return "Sorcier";
    }

    @Override
    public int ennemiDamageDealt() {
        return 2;
    }
}

