package jeu.plateau.dice;

import java.util.Random;

public class DiceSix implements Dice {
    private final Random random;

    public DiceSix() {
        random = new Random();
    }

    @Override
    public int lancer() {
        return  random.nextInt(6) +1;
    }
}
