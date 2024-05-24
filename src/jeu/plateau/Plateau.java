package jeu.plateau;

import jeu.plateau.casePlateau.Case;
import jeu.plateau.casePlateau.arme.Eclair;
import jeu.plateau.casePlateau.arme.Epee;
import jeu.plateau.casePlateau.arme.Feu;
import jeu.plateau.casePlateau.arme.Massue;
import jeu.plateau.casePlateau.ennemi.Dragons;
import jeu.plateau.casePlateau.ennemi.Gobelins;
import jeu.plateau.casePlateau.ennemi.Sorciers;
import jeu.plateau.casePlateau.potion.PotionGrande;
import jeu.plateau.casePlateau.potion.PotionStandard;
import jeu.plateau.casePlateau.vide.CaseVide;
import jeu.plateau.casePlateau.ennemi.Ennemi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plateau {
    List<Case> cases;

    public Plateau() {
        this.cases = new ArrayList<>();
        this.cases.add(null);//0
        this.cases.add(new Eclair(2));
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins());
        this.cases.add(new Eclair(2));
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins());
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Eclair(2));
        this.cases.add(new Gobelins());
        this.cases.add(new Sorciers());//10
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins());
        this.cases.add(new PotionStandard(2));
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins());
        this.cases.add(new CaseVide());
        this.cases.add(new Eclair(2));
        this.cases.add(new Gobelins());
        this.cases.add(new Epee(5));
        this.cases.add(new Sorciers());//20
        this.cases.add(new Gobelins());
        this.cases.add(new Massue(3));
        this.cases.add(new Eclair(2));
        this.cases.add(new Gobelins());
        this.cases.add(new Sorciers());
        this.cases.add(new Epee(5));
        this.cases.add(new Gobelins());
        this.cases.add(new PotionGrande(5));
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins());//30
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Sorciers());
        this.cases.add(new PotionStandard(2));
        this.cases.add(new CaseVide());
        this.cases.add(new Sorciers());
        this.cases.add(new Sorciers());
        this.cases.add(new Sorciers());
        this.cases.add(new Massue(3));
        this.cases.add(new PotionGrande(5));
        this.cases.add(new Sorciers());//40
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Epee(5));
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Sorciers());
        this.cases.add(new Dragons());
        this.cases.add(new CaseVide());
        this.cases.add(new Sorciers());
        this.cases.add(new Feu(7));
        this.cases.add(new Feu(7));
        this.cases.add(new CaseVide());//50
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Epee(5));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Dragons());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());//60
        this.cases.add(new CaseVide());
        this.cases.add(new Dragons());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());//64


    }

    public Case getCase(int currentPosition) {
        return this.cases.get(currentPosition);
    }

    public int size() {
        return cases.size();
    }
}
//public class Plateau {
//    List<Case> cases;
//
//    public Plateau() {
//        this.cases = new ArrayList<>();
//
//        // Ajouter un nombre spécifique de chaque type de case
//        addCases(new Dragons(15), 4);
//        addCases(new Sorciers(9), 10);
//        addCases(new Gobelins(6), 10);
//        addCases(new Massue(3), 5);
//        addCases(new Epee(5), 4);
//        addCases(new Eclair(2), 5);
//        addCases(new Feu(7), 2);
//        addCases(new PotionStandard(2), 6);
//        addCases(new PotionGrande(5), 2);
//        addCases(new CaseVide(), 16);
//
//        // Mélanger les cases pour randomiser leur ordre
//        Collections.shuffle(this.cases);
//
//        // Ajouter une case vide au début (index 0) si nécessaire
//        this.cases.add(0, null);
//    }
//
//    // Méthode pour ajouter un nombre spécifique de cases du même type
//    private void addCases(Case c, int count) {
//        for (int i = 0; i < count; i++) {
//            this.cases.add(c);
//        }
//    }
//
//    public Case getCase(int currentPosition) {
//        return this.cases.get(currentPosition);
//    }
//
//    public int size() {
//        return cases.size();
//    }
//}
