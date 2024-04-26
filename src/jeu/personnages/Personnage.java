package jeu.personnages;

public class Personnage {
        //attributes
    private String name;
    private String type;
        //constructor
    public Personnage(){

    }
    public Personnage(String name){
        this.name=name;
    }
    public Personnage(String name, String type){
        this.name =name;
        this.type=type;
    }
        //getter
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
        //setter
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
        // toString
    public String toString(){
        return "Personnage [name=" + name + ", type=" + type + "]";
    }
}
