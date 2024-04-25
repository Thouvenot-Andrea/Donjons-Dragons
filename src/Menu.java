import java.util.Scanner;

public class Menu {
    public String afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        String choix = "";

        while (!choix.equals("1") && !choix.equals("2")) {
            System.out.println("=== MENU ===");
            System.out.println("1. Nouveau personnage");
            System.out.println("2. Quitter le jeu");
            System.out.print("Votre choix : ");
            choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("Création d'un nouveau personnage...");
                    // You can add the logic for creating a new character here
                    break;
                case "2":
                    System.out.println("Merci d'avoir joué !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
        }
        return choix;
    }

}


