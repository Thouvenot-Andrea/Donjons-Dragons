package jeu.personnages;

import jeu.personnages.equipement.defensif.Bouclier;
import jeu.personnages.equipement.offensif.Arme;

public class Warrior extends Personnage {

    private final Bouclier equipementDefensif;
    private final Arme equipementOffensif;

    public int getDamageBase() {
        return 1;
    }

    public Warrior(String name) {
        super(name, 10, 1);
        this.setType("WARRIOR");

        equipementDefensif = new Bouclier();
        this.setEquipementDefensif(String.valueOf(equipementDefensif));
        this.setPv(this.getPv() + equipementDefensif.getDefenceLevel());

        equipementOffensif = new Arme();
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


