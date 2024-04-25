import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        String choix = "";
        while (!choix.equals("1") && !choix.equals("2")) {
            System.out.println("=== MENU ===");
            System.out.println("1. Nouveau personnage");
            System.out.println("2. Quitter le jeu");
            System.out.print("Votre choix : ");
            choix = choice.nextLine(); // Read user input

            switch (choix) {
                case "1":
                    System.out.println("Création d'un nouveau personnage...");
                    break;
                case "2":
                    System.out.println("Merci d'avoir joué !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
        }
    }
}