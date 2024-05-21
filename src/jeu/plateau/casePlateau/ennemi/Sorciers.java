package jeu.plateau.casePlateau.ennemi;

public class Sorciers extends Ennemi {

    public Sorciers() {
        super(getDefaultPv());
    }

    @Override
    public String afficher() {
        return "Sorcier";
    }

    public static int getDefaultPv() {
        return 9;
    }

    @Override
    public int getPv() {
        return super.getPv();
    }

    @Override
    public int ennemiDamageDealt() {
        return 2;
    }

}

