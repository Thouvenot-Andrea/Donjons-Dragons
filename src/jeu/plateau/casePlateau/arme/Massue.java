package jeu.plateau.casePlateau.arme;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;
import jeu.personnages.Warrior;

import static java.awt.SystemColor.menu;

public class Massue extends Arme {

    public Massue(int attaquePv) {
        super(attaquePv);
    }

    @Override
    public String afficher() {
        return "MASSUE";
    }


    @Override
    public void interagirAvecJoueur(Personnage personnage,Menu menu) {
        StringBuilder armeResult = new StringBuilder();
        if (personnage instanceof Warrior warrior) {
            int currentWeaponDamage = warrior.attaqueArme();
            if (currentWeaponDamage < this.getArmeDamage()) {
                armeResult.append("L'arme précédente est remplacée.\n");
                int totalDamage = warrior.getDamageBase() + this.getArmeDamage();
                warrior.setAddArme(this.afficher(),this.getArmeDamage());
                warrior.setDamage(totalDamage);
                warrior.setEquipementOffensif(String.valueOf(this));
                armeResult.append("Vous vous équiper d'une ").append(this.afficher()).append("\n");
                armeResult.append("Vous infligez ").append(this.getArmeDamage()).append(" points de dégâts avec cette arme en plus des dégats de base.\n");
            } else {
                armeResult.append("L'arme n'est pas plus puissante que l'arme actuelle.\n");
                armeResult.append("Vous conservez votre arme.\n");
            }
        } else {
            armeResult.append("Seuls les Warriors peuvent équiper cette Arme!!!!");
        }
        menu.showCombatResult(armeResult.toString());
    }

}

