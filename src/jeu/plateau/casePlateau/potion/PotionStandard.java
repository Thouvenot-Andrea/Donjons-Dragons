package jeu.plateau.casePlateau.potion;

public class PotionStandard implements Potion {
    @Override
    public String getPotionAleatoire() {
        return "Potion Standard";
    }

    @Override
    public int getPointsDeVie() {
        return 2;
    }

    @Override
    public String toString() {
        return "Potion Standard";
    }
}
