package jeu.plateau.casePlateau.ennemi;

public class Dragons extends Ennemi {
    public Dragons(int health) {
        super(health);
    }
    @Override
    public String afficher() {
        return "Dragon";
    }
}


