package jeu.personnages.equipement.defensif;

public class Bouclier extends EquipementDefensif {
    public Bouclier() {
        super("Bouclier en bois ", 0);
    }

    public Bouclier(String type, int defenceLevel) {
        super(type, defenceLevel);
    }

    @Override
    public String toString() {
        return getType() + "; Niveau de Défence: " + getDefenceLevel() + " Pv";
    }
}


