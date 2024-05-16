package jeu.plateau.casePlateau.arme;


import jeu.lancement.Menu;
import jeu.personnages.Personnage;

public class Epee extends Arme {

    public Epee(int armeDamage){
        super(armeDamage);
    }

    @Override
    public int ArmeDamage() {
        return 5;
    }

    @Override
    public String afficher() {
        return "une Epee";
    }

    @Override
    public String interagir(Personnage personnage) {
        return "La Epee interagit avec le personnage.";
    }

    @Override
    public void interagirAvecJoueur(Personnage personnage, Menu menu) {

    }
}