package jeu.plateau.casePlateau;

import jeu.plateau.dice.DiceOne;
import jeu.plateau.dice.DiceSix;

public class CaseVide implements Case {
//    private DiceSix dice;
    private DiceOne dice;
    public CaseVide(){
//        this.dice = new DiceSix();
        this.dice = new DiceOne();
    }

    @Override
    public String afficher() {
        String message = "----------------------------Vous êtes sur une Case vide.----------------------";
        int resultatDe = dice.lancer();
        return message;
    }
}
