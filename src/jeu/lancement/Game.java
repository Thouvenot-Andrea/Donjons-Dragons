package jeu.lancement;

import java.util.Random;

public class Game {
    private final Menu menu;
    private int[] plateau = new int[64];
    private Random number = new Random();

    public Game(Menu menu) {
        this.menu = menu;
    }

    public void play() {
        menu.createPerson();
        int i = 0;
        while( i< plateau.length ) {

        }
    }
}



