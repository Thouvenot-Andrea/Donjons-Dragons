import java.util.Scanner;

public class EquipementDefensif {
    String type;
    String nom;
    int niveauDefense;

    public EquipementDefensif() {

    }

    public EquipementDefensif(String type, String nom, int niveauDefense) {
        this.type = type;
        this.nom = nom;
        this.niveauDefense = niveauDefense;
    }


    public void equipementDefensif(String type) {
        if (type.equals("Magician")) {
            System.out.println("Équipement Défensif : Philtre");
        } else {
            System.out.println("Équipement Défensif :Bouclier ");
        }
    }
}


