package jeu.plateau.casePlateau.arme;


import jeu.lancement.Menu;
import jeu.personnages.Personnage;
import jeu.personnages.Warrior;

import static java.awt.SystemColor.menu;

public class Massue extends Arme {

    public Massue(int armeDamage) {
        super(armeDamage);
    }

    @Override
    public int ArmeDamage() {
        return 3;
    }

    @Override
    public String afficher() {
        return "une MASSUE";
    }


    @Override
    public void interagirAvecJoueur(Personnage personnage, Menu menu) {
        String armeResult = interagir(personnage);
        menu.showCombatResult(armeResult);
    }

    @Override
    public String interagir(Personnage personnage) {
        StringBuilder armeResult = new StringBuilder();
        armeResult.append("Dégât de l'arme: ").append(getArmeDamage()).append(" PV.").append("\n");

        if (personnage instanceof Warrior) {
            armeResult.append(personnage.getDamage()).append(" Pv \n");
            armeResult.append("La massue interagit avec le personnage.\n");
            int degatsPersonnage = personnage.getDamage() + ArmeDamage();
            personnage.setDamage(degatsPersonnage);
            armeResult.append("Vous infligez ").append(degatsPersonnage).append(" PV.");


        } else {
            armeResult.append("Seuls les Warriors peuvent équiper cette Arme!!!!");
        }
        return armeResult.toString();
    }

}
