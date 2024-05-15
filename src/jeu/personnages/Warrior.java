package jeu.personnages;


import jeu.personnages.equipement.defensif.Bouclier;
import jeu.personnages.equipement.defensif.Philtre;
import jeu.personnages.equipement.offensif.Arme;

public class Warrior extends Personnage {

    private final Bouclier equipementDefensif = new Bouclier();
    private final Arme equipementOffensif = new Arme();

    public Warrior(String name) {
        super(name, 10, 1);
        this.setType("WARRIOR");

        Bouclier bouclier = new Bouclier();
        this.setEquipementDefensif(String.valueOf(bouclier));
        this.setPv(this.getPv() + bouclier.getDefenceLevel());

        Arme arme = new Arme();
        this.setEquipementOffensif(String.valueOf(arme));
        this.setDamage(this.getDamage()+ arme.getAttaqueLevel());
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

