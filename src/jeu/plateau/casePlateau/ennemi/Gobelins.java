package jeu.plateau.casePlateau.ennemi;

public class Gobelins extends Ennemi {

    private static int getPv = 15;

    public Gobelins() {
        super(getPv);
    }

    @Override
    public String afficher() {
        return "Gobelin";
    }

    @Override
    public int ennemiDamageDealt() {
        return 2;
    }
}