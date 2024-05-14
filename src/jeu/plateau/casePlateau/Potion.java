package jeu.plateau.casePlateau;

import java.util.Random;

public class Potion implements Case {
    // Méthode pour obtenir une potion aléatoire
    public String getPotionAleatoire() {
        Random random = new Random();
        int rand = random.nextInt(3); // Génère un nombre aléatoire entre 0 et 2
        switch (rand) {
            case 0:
                return "potion de soin faible";
            case 1:
                return "potion de soin moyenne";
            default:
                return "potion de soin forte";
        }
    }

    // Méthode pour obtenir le nombre de points de vie associé à une potion
    public int getPointsDeVie(String potion) {
        switch (potion) {
            case "potion de soin faible":
                return 2;
            case "potion de soin moyenne":
                return 5;
            case "potion de soin forte":
                return 10;
            default:
                return 0; // En cas de potion inconnue
        }
    }

    @Override
    public String afficher() {
        return ""; // Ne fait rien car cette méthode est utilisée pour les cases vides
    }
}

