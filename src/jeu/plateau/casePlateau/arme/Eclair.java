package jeu.plateau.casePlateau.arme;

import jeu.lancement.Menu;
import jeu.personnages.Mage;
import jeu.personnages.Personnage;

import static java.awt.SystemColor.menu;


public class Eclair extends Arme {

    public Eclair(int attaquePv) {
        super(attaquePv);
    }
    public String afficher(){
        return "ECLAIR";
    }


    @Override
    public void interagirAvecJoueur(Personnage personnage,Menu menu) {
        StringBuilder armeResult = new StringBuilder();
        if (personnage instanceof Mage mage) {
            int currentWeaponDamage = mage.attaqueArme();
            if (currentWeaponDamage < this.getArmeDamage()) {
                armeResult.append("L'arme précédente est remplacée.\n");
                int totalDamage = mage.getDamageBase() + this.getArmeDamage();
                mage.setAddArme(this.afficher(),this.getArmeDamage());
                mage.setDamage(totalDamage);
                mage.setEquipementOffensif(String.valueOf(this));
                armeResult.append("Vous vous équiper d'une ").append(this.afficher()).append("\n");
                armeResult.append("Vous infligez ").append(this.getArmeDamage()).append(" points de dégâts avec cette arme en plus des dégats de base.\n");
            } else {
                armeResult.append("L'arme n'est pas plus puissante que l'arme actuelle.\n");
                armeResult.append("Vous conservez votre arme.\n");
            }
        } else {
            armeResult.append("Seuls les Mages peuvent équiper cette Arme!!!!");
        }
        menu.showCombatResult(armeResult.toString());

    }

}
