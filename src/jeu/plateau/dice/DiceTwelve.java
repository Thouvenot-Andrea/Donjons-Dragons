package jeu.plateau.dice;

import java.util.Random;

public class DiceTwelve implements Dice {

    private final Random random;
    public DiceTwelve(){
        random = new Random();
    }

    @Override
    public int lancer() {
        return random.nextInt(12)+1;
    }
}
