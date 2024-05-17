package jeu.personnages;

import jeu.personnages.equipement.defensif.Philtre;
import jeu.personnages.equipement.offensif.Sort;

import java.util.Random;

public class Mage extends Personnage {
    private final Philtre equipementDefensif;
    private final Sort equipementOffensif;

    public Mage(String name) {
        super(name, 10, 1);
        this.setType("MAGE");

        equipementDefensif = new Philtre();
        this.setEquipementDefensif(String.valueOf(equipementDefensif));
        this.setPv(this.getPv() + equipementDefensif.getDefenceLevel());

        equipementOffensif = new Sort();
        this.setEquipementOffensif(String.valueOf(equipementOffensif));


    }



    @Override
    public String toString() {
        String parentString = super.toString();

        String pvString = "Pv: " + getPv() + " (" + (getPv() - equipementDefensif.getDefenceLevel()) + "+" + equipementDefensif.getDefenceLevel() + ")";
        parentString = parentString.replaceFirst("Pv: \\d+", pvString);

        String damageString = "Damage: " + getDamage() + " (" + (getDamage() - equipementOffensif.getAttaqueLevel()) + "+" + equipementOffensif.getAttaqueLevel() + ")";
        parentString = parentString.replaceFirst("Damage: \\d+", damageString);

        return parentString;
    }
}

