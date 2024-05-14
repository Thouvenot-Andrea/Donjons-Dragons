package jeu.plateau.casePlateau.potion;

import jeu.plateau.casePlateau.Case;
import java.util.Random;

public class CasePotion implements Case {
    private final Potion potion;

    public CasePotion() {
        this.potion = choisirPotionAleatoire();
    }

    private Potion choisirPotionAleatoire() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new PotionGrande();
        } else {
            return new PotionStandard();
        }
    }

    public Potion getPotion() {
        return this.potion;
    }

    @Override
    public String afficher() {
        return "Vous avez trouvé une " + potion.afficher();
    }
}
