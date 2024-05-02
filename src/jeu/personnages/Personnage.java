package jeu.personnages;

public abstract class Personnage {
    //attributes
    private String name;
    private int pv;
    private int damage;
    private String type;
    private String equipementOffensif;
    private String equipementDefensif;

    //constructor
    public Personnage() {

    }

    public Personnage(String name) {
        this.name = name;
        this.pv = 10;
        this.damage = 1;
    }

    public Personnage(String name, int pv, int damage) {
        this.name = name;
        this.pv = pv;
        this.damage = damage;

    }


    //name ( Getter et Setter)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // pv ( Getter et Setter)
    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
            this.pv = pv;
    }


    //damage ( Getter et Setter)
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    //type ( Getter et Setter)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    // équipement offensif ( Getter et Setter)
    public String getEquipementOffensif() {
        return equipementOffensif;
    }

    public void setEquipementOffensif(String equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }


    // équipement défensif ( Getter et Setter)
    public String getEquipementDefensif() {
        return equipementDefensif;
    }

    public void setEquipementDefensif(String equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }


    // toString
    public String toString() {
        return "\n" +
//                "   Type: " + type + "\n" +
                "   Name: " + name + "\n" +
                "   Damage: " + damage + "\n" +
                "   Pv: " + pv + "\n" +
                "   Equipement Offensif: " + equipementOffensif + "\n" +
                "   Equipement Defensif: " + equipementDefensif +
                "\n";

    }
}
