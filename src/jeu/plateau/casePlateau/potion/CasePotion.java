package jeu.plateau.casePlateau.potion;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;
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
        return "Vous avez trouvé une " + potion.toString();
    }

    @Override
    public String interagir(Personnage hero) {
        hero.setPv(hero.getPv() + potion.getPointsDeVie());
        return null;
    }

    @Override
    public void interagirAvecJoueur(Personnage personnage, Menu menu) {

    }
}
