package jeu.plateau.casePlateau.ennemi;

public class Dragons extends Ennemi {

    private static int getPv = 6;

    public Dragons() {
        super(getPv);
    }

    @Override
    public String afficher() {
        return "Dragon";
    }

    @Override
    public int ennemiDamageDealt() {
        return 1;
    }
}


