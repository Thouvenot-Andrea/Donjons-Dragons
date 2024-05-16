package jeu.personnages;

import jeu.personnages.equipement.defensif.Bouclier;
import jeu.personnages.equipement.offensif.Arme;
import java.util.Random;

public class Warrior extends Personnage {

    private final Bouclier equipementDefensif;
    private final Arme equipementOffensif;

    public Warrior(String name) {
        super(name, 10, 1);
        this.setType("WARRIOR");

        equipementDefensif = new Bouclier();
        this.setEquipementDefensif(String.valueOf(equipementDefensif));
        this.setPv(this.getPv() + equipementDefensif.getDefenceLevel());

        equipementOffensif = new Arme();
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

