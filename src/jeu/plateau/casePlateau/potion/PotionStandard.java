package jeu.plateau.casePlateau.potion;

public class PotionStandard extends Potion {

    public PotionStandard(int potionPv) {
        super(potionPv);
    }

    @Override
    public String afficher() {
        return "Potion Standard";
    }

    @Override
    public String getPotionAleatoire() {
        return "Potion Standard";
    }

    @Override
    public int getPointsDeVie() {
        return 2;
    }


}

