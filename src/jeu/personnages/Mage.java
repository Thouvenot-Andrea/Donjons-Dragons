package jeu.personnages;

import jeu.personnages.equipement.defensif.Philtre;
import jeu.personnages.equipement.offensif.Sort;

public class Mage extends Personnage {

    private final Philtre equipementDefensif = new Philtre();
    private final Sort  equipementOffensif =  new Sort();

    public Mage(String name) {
        super(name, 6 , 15);
        this.setType("MAGE");

        Philtre philtre = new Philtre();
        this.setEquipementDefensif(String.valueOf(philtre));
        this.setPv(this.getPv() + philtre.getDefenceLevel());

        Sort sort = new Sort();
        this.setEquipementOffensif(String.valueOf(sort));
        this.setDamage(this.getDamage() + sort.getAttaqueLevel());

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

