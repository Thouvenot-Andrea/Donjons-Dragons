public class EquipementOffensif {
    //attributes
    private String type;
    private int defenseLevel;
    private String name;

    //constructor
    public EquipementOffensif(String type, int defenseLevel, String name) {
        this.type = type;
        this.defenseLevel = defenseLevel;
        this.name = name;
    }

    //getter
    public String getType() {
        return type;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getName() {
        return name;
    }

    //setter
    public String setType(String type) {
        return this.type = type;
    }

    public String setDefenseLevel(int defenseLevel) {
        return defenseLevel + "";
    }

    public String setName(String name) {
        return this.name = name;
    }

    //toString
    public String toString() {
        return type + " " + defenseLevel + " " + name;
    }
}











