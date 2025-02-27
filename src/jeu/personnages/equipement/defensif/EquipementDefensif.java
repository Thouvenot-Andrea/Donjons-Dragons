package jeu.personnages.equipement.defensif;

public abstract class EquipementDefensif {
    //attributes
    private String type;
    private int defenceLevel;

    //constructor
    public EquipementDefensif(String type, int defenceLevel) {
        this.type = type;
        this.defenceLevel = defenceLevel;
    }

    public EquipementDefensif() {

    }

    //getter
    public String getType() {
        return type;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    //setter
    public void setType(String type) {
        this.type = type;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    //toString
    public String toString() {
        return type + " " + defenceLevel + " ";
    }
}






































