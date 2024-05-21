package jeu.plateau.casePlateau.potion;

public class PotionGrande extends Potion {

    public PotionGrande(int potionPv) {
        super(potionPv);
    }

    @Override
    public String afficher() {
        return "Potion Grande";
    }

    @Override
    public String getPotionAleatoire() {
        return "Potion Grande";
    }

    @Override
    public int getPointsDeVie() {
        return 5;
    }

}
