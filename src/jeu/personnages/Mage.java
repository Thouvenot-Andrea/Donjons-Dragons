package jeu.personnages;

import jeu.personnages.equipement.defensif.Philtre;
import jeu.personnages.equipement.offensif.Sort;

public class Mage extends Personnage {
    private final Philtre equipementDefensif;
    private final Sort equipementOffensif;

    public int getDamageBase() {
        return 8;
    }

    public Mage(String name) {
        super(name, 10, 8);
        this.setType("MAGE");

        equipementDefensif = new Philtre();
        this.setEquipementDefensif(String.valueOf(equipementDefensif));
        this.setPv(this.getPv() + equipementDefensif.getDefenceLevel());

        equipementOffensif = new Sort();
        this.setEquipementOffensif(String.valueOf(equipementOffensif));
        this.setDamage(this.getDamage() + equipementOffensif.getAttaqueLevel());


    }
    public int damageTotal() {
        return this.getDamageBase() + equipementOffensif.getAttaqueLevel();
    }
    public int attaqueArme(){
        return equipementOffensif.getAttaqueLevel();
    }

    public void setAddArme(String Name, int Level){
        this.equipementOffensif.setAttaqueLevel(Level);
        this.equipementOffensif.setType(Name);
    }

    @Override
    public String toString() {
        String parentString = super.toString();

        String pvString = "Pv: " + getPv() + " (" + (getPv() - equipementDefensif.getDefenceLevel()) + "+" + equipementDefensif.getDefenceLevel() + ")";
        parentString = parentString.replaceFirst("Pv: \\d+", pvString);

        String damageString = "Damage: " + damageTotal() + " (" + getDamageBase() + "+" + equipementOffensif.getAttaqueLevel() + ")";
        parentString = parentString.replaceFirst("Damage: \\d+", damageString);

        return parentString;
    }
}

