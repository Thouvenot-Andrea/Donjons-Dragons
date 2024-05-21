package jeu.plateau;

import jeu.plateau.casePlateau.Case;
import jeu.plateau.casePlateau.arme.Eclair;
import jeu.plateau.casePlateau.arme.Epee;
import jeu.plateau.casePlateau.arme.Feu;
import jeu.plateau.casePlateau.arme.Massue;
import jeu.plateau.casePlateau.ennemi.Dragons;
import jeu.plateau.casePlateau.ennemi.Gobelins;
import jeu.plateau.casePlateau.ennemi.Sorciers;
import jeu.plateau.casePlateau.potion.Potion;
import jeu.plateau.casePlateau.potion.PotionGrande;
import jeu.plateau.casePlateau.potion.PotionStandard;
import jeu.plateau.casePlateau.vide.CaseVide;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    List<Case> cases;

    public Plateau() {
        this.cases = new ArrayList<>();
        this.cases.add(null);//0
        this.cases.add(new Eclair(2));
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins(1));
        this.cases.add(new Eclair(2));
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins(1));
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Eclair(2));
        this.cases.add(new Gobelins(1));
        this.cases.add(new Sorciers(9));//10
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins(1));
        this.cases.add(new PotionStandard(2));
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(1));
        this.cases.add(new CaseVide());
        this.cases.add(new Eclair(2));
        this.cases.add(new Gobelins(1));
        this.cases.add(new Epee(5));
        this.cases.add(new Sorciers(9));//20
        this.cases.add(new Gobelins(1));
        this.cases.add(new Massue(3));
        this.cases.add(new Eclair(2));
        this.cases.add(new Gobelins(1));
        this.cases.add(new Sorciers(9));
        this.cases.add(new Epee(5));
        this.cases.add(new Gobelins(1));
        this.cases.add(new PotionGrande(5));
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(1));//30
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Sorciers(9));
        this.cases.add(new PotionStandard(2));
        this.cases.add(new CaseVide());
        this.cases.add(new Sorciers(9));
        this.cases.add(new Sorciers(9));
        this.cases.add(new Sorciers(9));
        this.cases.add(new Massue(3));
        this.cases.add(new PotionGrande(5));
        this.cases.add(new Sorciers(9));//40
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Epee(5));
        this.cases.add(new PotionStandard(2));
        this.cases.add(new Sorciers(9));
        this.cases.add(new Dragons(15));
        this.cases.add(new CaseVide());
        this.cases.add(new Sorciers(9));
        this.cases.add(new Feu(7));
        this.cases.add(new Feu(7));
        this.cases.add(new CaseVide());//50
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Epee(5));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Dragons(15));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());//60
        this.cases.add(new CaseVide());
        this.cases.add(new Dragons(15));
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