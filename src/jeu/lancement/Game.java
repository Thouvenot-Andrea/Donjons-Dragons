package jeu.lancement;

import java.util.Random;
import java.util.Scanner;


public class Game {
    private final Menu menu;
    private final Random number = new Random();

    public Game(Menu menu) {
        this.menu = menu;
    }

    public void play() {
        menu.menuGame();
        movePlayer();
    }

    public void movePlayer() {
        Scanner scanner = new Scanner(System.in);
        int currentPosition = 1; // Le joueur commence à la case 1
        int finalPosition = 64; // Dernière case du plateau

        while (currentPosition < finalPosition) {
            int diceRoll = number.nextInt(6) + 1; // nombre aléatoire entre 1 et 6)
            currentPosition += diceRoll; // Avancer
            if (currentPosition > finalPosition) {
                currentPosition = finalPosition; // S'assurer que le joueur n'aille pas au-delà de la dernière case
            }
            System.out.println("Avancement du joueur : Case " + currentPosition + " / " + finalPosition);
        }

        System.out.println("Le joueur est arrivé à la fin du plateau.");
        System.out.println("Voulez-vous recommencer une partie ( YES or NO) ?");


        String reponse = scanner.next().toLowerCase();
        if (reponse.equalsIgnoreCase("yes") || reponse.equalsIgnoreCase("y")) {
            movePlayer();
        } else if (reponse.equalsIgnoreCase("no") || reponse.equalsIgnoreCase("n")) {
            System.out.println("Merci d'avoir joué!");
        }

    }
}



