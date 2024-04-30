package jeu.lancement;

import java.util.Scanner;

import jeu.PersonnageHorsPlateauException;
import jeu.personnages.Mage;
import jeu.personnages.Personnage;
import jeu.personnages.Warrior;

public class Menu {
    private Personnage personnage;


    public boolean menuGame() {
        Scanner scanner = new Scanner(System.in);
        boolean personnageCree = false;
        boolean continuerJeu = true;
        Game game = new Game(this);

        while (continuerJeu) {
            System.out.println("1. Créer un personnage");
            System.out.println("2. Modifier un personnage");
            System.out.println("3. Info du personnage");
            System.out.println("4. Quitter le jeu");
            System.out.println("5. Commencer le jeu");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            if (choix >= 1 && choix <= 5) {
                switch (choix) {
                    case 1:
                        createPerson();
                        personnageCree = true;
                        break;
                    case 2:
                        if (personnageCree) {
                            modifyPerson();
                        } else {
                            System.out.println("Vous devez créer un personnage pour le modifier !");
                        }
                        break;
                    case 3:
                        infos();
                        break;
                    case 4:
                        System.out.println("À bientôt sur Donjons & Dragons  !");
                        continuerJeu = false;
                        break;
                    case 5:
                        if (personnageCree) {
                            System.out.println("Le jeu commence !");
                            try {
                                game.movePlayer();
                            } catch (PersonnageHorsPlateauException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                }
            } else {
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
        return false;
    }

    public boolean createPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenue dans Donjons & Dragons !");
        System.out.println("Entrez votre nom : ");
        String nom = input.nextLine().toUpperCase();
        String typeStr = "";
        while (!typeStr.equals("WARRIOR") && !typeStr.equals("MAGE")) {
            System.out.println("Entrez votre type (WARRIOR ou MAGE) : ");
            typeStr = input.nextLine().toUpperCase();
            switch (typeStr) {
                case "WARRIOR":
                    personnage = new Warrior(nom);
                    break;
                case "MAGE":
                    personnage = new Mage(nom);
                    break;
                default:
                    System.out.println("Type invalide. Vous avez été déclaré comme Warrior par défaut.");
                    return false;
            }
        }
        System.out.println("Vous êtes maintenant un " + personnage.getType());
        return false;
    }


    public void infos() {
        if (personnage != null) {
            if (personnage instanceof Mage) {
                System.out.println(personnage);
            } else if (personnage instanceof Warrior) {
                System.out.println(personnage);
            }

        } else {
            System.out.println("Vous n'avez pas encore créé de personnage.");
        }
    }


    public void modifyPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String name = input.nextLine().toUpperCase();
        while (true) {
            System.out.println("Entre le type (Warrior ou MAGE): ");
            String type = input.nextLine().toUpperCase();
            System.out.println("Vous êtes maintenant un " + type);
            if (type.equals("WARRIOR") || type.equals("MAGE")) {
                if (type.equals("WARRIOR")) {
                    if (personnage instanceof Warrior) {
                        personnage.setName(name);
                    } else {
                        personnage = new Warrior(name);
                    }
                } else {
                    if (personnage instanceof Mage) {
                        personnage.setName(name);
                    } else {
                        personnage = new Mage(name);
                    }
                }
                break;
            } else {
                System.out.println("error");
            }
        }
    }

    public void display(String message) {
        System.out.println(message);
    }
}


