package jeu.plateau.casePlateau.ennemi;

public class Dragons extends Ennemi {
    public Dragons() {
        super(getDefaultPv());
    }

    @Override
    public String afficher() {
        return "Dragon";
    }

    public static int getDefaultPv() {
        return 6;
    }

    @Override
    public int getPv() {
        return super.getPv();
    }

    @Override
    public int ennemiDamageDealt() {
        return 1;
    }
}


