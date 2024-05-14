package jeu.plateau.casePlateau.arme;

import jeu.personnages.Personnage;
import jeu.plateau.casePlateau.Case;

public class CaseArme implements Case {
    @Override
    public String afficher() {
        return "Vous avez trouvé une arme";
    }

    @Override
    public String interagir(Personnage hero) {
//        if (hero instanceof Warrior) {
//            hero.setEquipementDefensif(arme);
//        }
        return null;
    }
    // random d'arme
}