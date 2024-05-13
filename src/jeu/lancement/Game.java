package jeu.lancement;

import jeu.PersonnageHorsPlateauException;
import jeu.plateau.dice.DiceSix;


import java.util.Random;
import java.util.Scanner;

public class Game {
    Menu menu = new Menu();
    private final Random number = new Random();

    public void play() throws PersonnageHorsPlateauException {
        menu.display("Bienvenue dans Donjons & Dragons !");
        menu.menuGame();
    }

    public void movePlayer() throws PersonnageHorsPlateauException {
        Scanner scanner = new Scanner(System.in);
        int currentPosition = 1; // Le joueur commence à la case 1
        int finalPosition = 64; // Dernière case du plateau
        final DiceSix dice = new DiceSix();
        try {
            while (currentPosition < finalPosition) {
                int diceRoll = dice.lancer();
                currentPosition += diceRoll;
                menu.de("Vous avez lancé de le Dé , résultat : " + diceRoll);
                menu.displacementPlayer("Avancement du joueur : Case " + currentPosition + " / " + finalPosition);

                if (currentPosition > finalPosition) {
                    throw new PersonnageHorsPlateauException();
                }
            }
            menu.end("Félicitations ! Vous avez  GAGNER !!!!!!!!!!");
            replay();
        } catch (PersonnageHorsPlateauException e) {
            menu.exception(e.getMessage());
            handleException();
        }
    }


    private void handleException() throws PersonnageHorsPlateauException {
        replay();
    }

    private void replay() throws PersonnageHorsPlateauException {
        menu.restart("Voulez-vous rejouer ? (yes or no)");
        String response = menu.getUserInput();

        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            movePlayer(); // Appel récursif pour rejouer
        } else {
            menu.thanks("Merci d'avoir joué :)");
        }
    }


}