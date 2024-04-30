package jeu.personnages;

public class Warrior extends Personnage {

    public Warrior(String name) {
        super(name);
        this.setType("WARRIOR");
        this.setPv(10);
        this.setDamage(10);
        this.setEquipementDefensif("BOUCLIER");
        this.setEquipementOffensif("ARME");
    }
}