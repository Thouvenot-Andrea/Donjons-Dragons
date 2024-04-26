import java.util.Scanner;

import jeu.personnages.Personnage;

public class Menu {
    private Personnage personnage;

    public boolean menuGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans Donjons & Dragons !");
        while (true) {
            System.out.println("1. Créer un personnage");
            System.out.println("2. Modifier un personnage");
            System.out.println("3. Info du personnage");
            System.out.println("4. Quitter le jeu");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    createPerson();
                    break;
                case 2:
                    modifyPerson();
                    break;
                case 3:
                    infos();
                    break;
                case 4:
                    System.out.println("Merci d'avoir joué à Donjons & Dragons !");
                    return false;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }


    public void display(String message) {
        System.out.println(message);
    }

    public void createPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenue dans Donjons & Dragons !");
        System.out.println("Entrez votre nom : ");
        String nom = input.nextLine();
        System.out.println("Entrez votre type (GUERRIER ou MAGICIEN) : ");
        String typeStr = input.nextLine().toUpperCase();
        switch (typeStr) {
            case "GUERRIER":
                personnage = new Personnage(nom, "Guerrier");
                break;
            case "MAGICIEN":
                personnage = new Personnage(nom, "Magicien");
                break;
            default:
                System.out.println("Type invalide. Vous avez été déclaré comme Guerrier par défaut.");
                personnage = new Personnage(nom, "Guerrier");
        }
        System.out.println("Vous êtes maintenant un " + personnage.getType());
    }


    public void infos() {
        if (personnage != null) {
            System.out.println(personnage.toString());
        } else {
            System.out.println("Vous n'avez pas encore créé de personnage.");
        }
    }

    public void modifyPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String name = input.nextLine();
        System.out.println("Entre le type (GUERRIER ou MAGICIEN): ");
        String type = input.nextLine();
        if (personnage != null) {
            personnage.setName(name);
            personnage.setType(type);
        }

    }
}
