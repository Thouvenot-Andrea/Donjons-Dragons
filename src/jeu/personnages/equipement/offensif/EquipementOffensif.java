package jeu.personnages.equipement.offensif;

public abstract class EquipementOffensif {
    //attributes
    private String type;
    private int attaqueLevel;


    //constructor
    public EquipementOffensif(String type, int attaqueLevel) {
        this.type = type;
        this.attaqueLevel = attaqueLevel;

    }

    public EquipementOffensif() {

    }

    //type ( Getter et Setter)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // attaque Level ( Getter et Setter)
    public int getAttaqueLevel() {
        return attaqueLevel;
    }

    public void setAttaqueLevel(int attaqueLevel) {
        this.attaqueLevel = attaqueLevel;
    }


    //toString
    public String toString() {
        return type + " " + attaqueLevel + " ";
    }
}











