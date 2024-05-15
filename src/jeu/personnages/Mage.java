package jeu.personnages;

import jeu.personnages.equipement.defensif.Philtre;
import jeu.personnages.equipement.offensif.Sort;

import java.util.Random;

public class Mage extends Personnage {
    private final Philtre equipementDefensif;
    private final Sort equipementOffensif;
    private final Random random;

    public Mage(String name) {
        super(name, 10, 1);
        this.setType("MAGE");

        equipementDefensif = new Philtre();
        this.setEquipementDefensif(String.valueOf(equipementDefensif));
        this.setPv(this.getPv() + equipementDefensif.getDefenceLevel());

        equipementOffensif = new Sort();
        this.setEquipementOffensif(String.valueOf(equipementOffensif));

        random = new Random();
    }

    @Override
    public int getDamage() {

        int totalDamage = getDamageBase(); // Attaque de base du joueur

        int spellDamage = random.nextInt(6) + 1; // Dégâts du sort
        totalDamage += spellDamage;

        return totalDamage;
    }

    private int getDamageBase() {
        return 1;
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

