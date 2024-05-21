package jeu.plateau.casePlateau.ennemi;

public class Gobelins extends Ennemi {

    public Gobelins() {
        super(getDefaultPv());
    }

    @Override
    public String afficher() {
        return "Gobelin";
    }

    public static int getDefaultPv() {
        return 15;
    }

    @Override
    public int getPv() {
        return super.getPv();
    }

    @Override
    public int ennemiDamageDealt() {
        return 4;
    }

}