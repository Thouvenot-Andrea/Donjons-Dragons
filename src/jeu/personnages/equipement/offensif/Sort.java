package jeu.personnages.equipement.offensif;

import java.util.Random;

public class Sort extends EquipementOffensif {
    public Sort(){
        super("Boule de feu", 0);
    }

    public Sort (String type,int attaqueLevel){
        super(type,attaqueLevel);
    }

    @Override
    public String toString(){
        return getType() + "; Niveau de Offensif: " + getAttaqueLevel() + " Pv";
    }
}
