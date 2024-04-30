package jeu.personnages;

public class Mage extends Personnage {

    public Mage(String name) {
        super(name,6,15);
        this.setType("MAGE");
        this.setPv(6);
        this.setDamage(15);
        this.setEquipementDefensif("PHILTRE");
        this.setEquipementOffensif("SORT");
    }

}

