package jeu.lancement;

import jeu.PersonnageHorsPlateauException;
import jeu.plateau.Case;
import jeu.plateau.CaseVide;
import jeu.plateau.Ennemi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Game {
    private final Menu menu;
    private final Random number = new Random();

    public Game(Menu menu) {
        this.menu = menu;

    }

    public void play() throws PersonnageHorsPlateauException {
        menu.menuGame();
        try {
            movePlayer();
        } catch (PersonnageHorsPlateauException e) {
            menu.exception(e.getMessage());
        }
    }

    public void movePlayer() throws PersonnageHorsPlateauException {
        Scanner scanner = new Scanner(System.in);
        int currentPosition = 1; // Le joueur commence à la case 1
        int finalPosition = 64; // Dernière case du plateau
        List<Case> plateau = createPlateau(); // Création du plateau

        while (currentPosition < finalPosition) {
            int diceRoll = number.nextInt(6) + 1; // Utilisation de l'objet number pour générer un nombre aléatoire
            currentPosition += diceRoll; // Avancer
            if (currentPosition <= finalPosition) {
                Case currentCase = plateau.get(currentPosition - 1);
                menu.displacementPlayer("Avancement du joueur : Case " + currentPosition + " / " + finalPosition + " Case vide");

                // Vérifier s'il y a un ennemi sur la case actuelle
                if (currentCase instanceof Ennemi) {
                    menu.displacementPlayer("Avancement du joueur : Case " + currentPosition + " / " + finalPosition + " Case Ennemi");
                    // Gérer l'interaction avec l'ennemi
                }
            }
        }

        if (currentPosition > finalPosition) {
            menu.offSet("Vous êtes en dehors du plateau");
        } else {
            menu.end("Le joueur est arrivé à la fin du plateau.");
        }
        menu.restart("Voulez-vous recommencer une partie ( YES or NO) ?");

        String reponse = scanner.next().toLowerCase();

        if (reponse.equalsIgnoreCase("yes") || reponse.equalsIgnoreCase("y")) {
            movePlayer();
        } else if (reponse.equalsIgnoreCase("no") || reponse.equalsIgnoreCase("n")) {
            menu.thanks("Merci d'avoir joué!");
        }
    }


    private List<Case> createPlateau() {
        List<Case> plateau = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            // Ajout de cases vides par défaut
            plateau.add(new CaseVide());
        }
        // Ajout d'un ennemi à des positions aléatoires
        for (int i = 0; i < 5; i++) {
            int randomPosition = number.nextInt(64);
            plateau.set(randomPosition, new Ennemi());
        }
        return plateau;
    }
}



