package jeu.lancement;

import jeu.PersonnageHorsPlateauException;
import jeu.personnages.Personnage;
import jeu.plateau.Plateau;
import jeu.plateau.casePlateau.Case;
import jeu.plateau.dice.DiceOne;
import jeu.plateau.dice.DiceSix;

public class Game {
    private final Personnage personnage;
    private final Menu menu;
    private final Plateau plateau;
    private final DiceOne dice;
//    private final DiceSix dice;

    public Game(Plateau plateau, Personnage personnage, Menu menu) {
        this.plateau = plateau;
        this.personnage = personnage;
        this.menu = menu;
        dice = new DiceOne();
    }

    public void play() {
        int currentPosition = 1;
        int finalPosition = 64;
        boolean playerWon = false;
        try {
            while (currentPosition < finalPosition) {

                if (personnage.getPv() <= 0) {
                    menu.defeat("Vous avez été vaincu. Game Over !");
                    return;
                } else {
                    currentPosition = movePersonnage(currentPosition);
                    Case gameCase = plateau.getCase(currentPosition);
                    menu.displacementPlayer(currentPosition, finalPosition);
                    menu.heroLandsOnCase(gameCase);
                    gameCase.interagirAvecJoueur(personnage, menu);
                }
            }
            playerWon = true;
        } catch (PersonnageHorsPlateauException e) {
            menu.exception(e.getMessage());
        }
        if (playerWon) {
            menu.end("Félicitations ! Vous avez GAGNÉ !!!!!!!!!!");
        }
    }

    private int movePersonnage(int currentPosition) throws PersonnageHorsPlateauException {
        int diceRoll = dice.lancer();
        menu.de(diceRoll);
        int newPosition = currentPosition + diceRoll;
        if (currentPosition >= plateau.size() - 1) {
            throw new PersonnageHorsPlateauException();
        }
        return newPosition;
    }
}


