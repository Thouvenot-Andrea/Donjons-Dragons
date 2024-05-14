package jeu.plateau.casePlateau.potion;

public class PotionStandard implements Potion {
    @Override
    public String getPotionAleatoire() {
        return "Potion Standard";
    }

    @Override
    public int getPointsDeVie(String potion) {
        return 2;
    }

    @Override
    public String afficher() {
        return "Potion Standard";
    }
}
