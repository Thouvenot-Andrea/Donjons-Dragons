package jeu.plateau.casePlateau.potion;

public class PotionGrande implements Potion {
    @Override
    public String getPotionAleatoire() {
        return "Grand Potion";
    }

    @Override
    public int getPointsDeVie(String potion) {
        return 5;
    }

    @Override
    public String afficher() {
        return "Grande Potion";
    }
}
