public class EquipementDefensif {
        //attributes
    private String type;
    private int attaqueLevel;
    private String name;
        //constructor
    public EquipementDefensif(String type, int niveauAttaque, String name){
        this.type = type;
        this.attaqueLevel = niveauAttaque;
    }
        //getter
    public String getType() {
        return type;
    }
    public int getAttaqueLevel() {
        return attaqueLevel;
    }
    public String getName() {
        return name;
    }
        //setter
    public void setType(String type) {
        this.type = type;
    }
    public void setAttaqueLevel(int attaqueLevel) {
        this.attaqueLevel = attaqueLevel;
    }
    public void setName(String name) {
        this.name = name;
    }
        //toString
    public String toString(){
        return type + " " + attaqueLevel + " " + name;
    }
}






































