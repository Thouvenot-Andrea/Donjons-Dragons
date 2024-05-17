package jeu.plateau.casePlateau.ennemi;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;

public class Sorciers extends Ennemi {
    public Sorciers(int health) {
        super(health);
    }
    @Override
    public String afficher() {
        return "Sorcier";
    }

    @Override
    public void interagirAvecJoueur(Personnage personnage, Menu menu) {

    }
}

