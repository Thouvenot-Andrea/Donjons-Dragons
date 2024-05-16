package jeu.plateau;

import jeu.plateau.casePlateau.Case;
import jeu.plateau.casePlateau.arme.Epee;
import jeu.plateau.casePlateau.arme.Massue;
import jeu.plateau.casePlateau.ennemi.Dragons;
import jeu.plateau.casePlateau.ennemi.Gobelins;
import jeu.plateau.casePlateau.ennemi.Sorciers;
import jeu.plateau.casePlateau.potion.CasePotion;
import jeu.plateau.casePlateau.vide.CaseVide;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    List<Case> cases;

    public Plateau() {
        this.cases = new ArrayList<>();
        this.cases.add(null);//0
        this.cases.add(new CaseVide());
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins(12));
        this.cases.add(new CaseVide());
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins(12));
        this.cases.add(new CasePotion());
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(12));
        this.cases.add(new Sorciers(18));//10
        this.cases.add(new Massue(3));
        this.cases.add(new Gobelins(12));
        this.cases.add(new CasePotion());
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(12));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(12));
        this.cases.add(new Epee(5));
        this.cases.add(new Sorciers(18));//20
        this.cases.add(new Gobelins(12));
        this.cases.add(new Massue(3));
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(12));
        this.cases.add(new Sorciers(18));
        this.cases.add(new Epee(5));
        this.cases.add(new Gobelins(12));
        this.cases.add(new CasePotion());
        this.cases.add(new CaseVide());
        this.cases.add(new Gobelins(12));//30
        this.cases.add(new CasePotion());
        this.cases.add(new Sorciers(18));
        this.cases.add(new CasePotion());
        this.cases.add(new CaseVide());
        this.cases.add(new Sorciers(18));
        this.cases.add(new Sorciers(18));
        this.cases.add(new Sorciers(18));
        this.cases.add(new Massue(3));
        this.cases.add(new CasePotion());
        this.cases.add(new Sorciers(18));//40
        this.cases.add(new CasePotion());
        this.cases.add(new Epee(5));
        this.cases.add(new CasePotion());
        this.cases.add(new Sorciers(18));
        this.cases.add(new Dragons(30));
        this.cases.add(new CaseVide());
        this.cases.add(new Sorciers(18));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());//50
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Epee(5));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new Dragons(30));
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());
        this.cases.add(new CaseVide());//60
        this.cases.add(new CaseVide());
        this.cases.add(new Dragons(30));
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