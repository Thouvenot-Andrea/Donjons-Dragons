package jeu.personnages.equipement.defensif;

public class Philtre extends EquipementDefensif {
    public Philtre() {
        super("Philtre de Néophyte", 2);
    }

    public Philtre(String type, int defenceLevel) {
        super(type, defenceLevel);
    }

    @Override
    public String toString() {
        return getType() + "; Niveau de Défence: " + getDefenceLevel() + " Pv";

    }
}