import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Menu menu = new Menu();
        String choix = menu.afficherMenu();
        Personnage personnage = new Personnage();
        String type = personnage.createPersonnage(choix);
        personnage.afficherInfos();
//        personnage.modificationInfos();
//        personnage.afficherInfos();
        EquipementDefensif equipementDefensif = new EquipementDefensif();
        equipementDefensif.equipementDefensif(type);


    }
}
