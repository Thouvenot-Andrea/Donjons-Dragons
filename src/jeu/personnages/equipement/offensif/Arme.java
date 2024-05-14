package jeu.personnages.equipement.offensif;

public class Arme extends EquipementOffensif {

    public Arme(){
        super("Epée en bois", 2);
    }

    public Arme(String type, int niveauAttaque) {
        super(type,niveauAttaque);

    }
    @Override
    public String toString(){
        return getType() + "; Niveau de Offensif: " + getAttaqueLevel() + " Pv";
    }
}
