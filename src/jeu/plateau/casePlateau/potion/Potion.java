package jeu.plateau.casePlateau.potion;


import jeu.lancement.Menu;
import jeu.personnages.Personnage;

public abstract class Potion implements CasePotion{

    private final int potionPv;

    public Potion(int getPointsDeVie){
        this.potionPv = getPointsDeVie;
    }
    @Override
    public void interagirAvecJoueur(Personnage personnage, Menu menu) {
        String potion = interagir(personnage);
        menu.showCombatResult(potion);
    }

    @Override
    public String interagir(Personnage personnage) {
        StringBuilder potion = new StringBuilder();
        potion.append("Vous avez ").append(personnage.getPv()).append(" Pv  avant la potion\n");
        int persoPv = personnage.getPv() + getPointsDeVie();
        personnage.setPv(persoPv);
        potion.append("Vous avez ").append(personnage.getPv()).append(" Pv  après la potion");
        return potion.toString();
    }
}