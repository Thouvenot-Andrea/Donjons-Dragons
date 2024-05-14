package jeu.plateau;

import jeu.plateau.casePlateau.Case;
import jeu.plateau.casePlateau.arme.CaseArme;
import jeu.plateau.casePlateau.ennemi.Dragons;
import jeu.plateau.casePlateau.potion.CasePotion;
import jeu.plateau.casePlateau.vide.CaseVide;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    List<Case> cases;

    public Plateau() {
        this.cases = new ArrayList<>();
        this.cases.add(null);
        this.cases.add(new CaseVide());
        this.cases.add(new CaseArme());
        this.cases.add(new Dragons(20));
        this.cases.add(new CasePotion());

    }

    public Case getCase(int currentPosition) {
        return this.cases.get(currentPosition);
    }

    public int size() {
        return cases.size();
    }
}