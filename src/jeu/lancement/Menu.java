package jeu.lancement;

import java.util.Scanner;

import jeu.PersonnageHorsPlateauException;
import jeu.personnages.Mage;
import jeu.personnages.Personnage;
import jeu.personnages.Warrior;

public class Menu {
    private Personnage personnage;

    // MENU
    public boolean menuGame() throws PersonnageHorsPlateauException {
        Scanner scanner = new Scanner(System.in);
        boolean personnageCree = false;
        boolean continuerJeu = true;
        Game game = new Game();

        while (continuerJeu) {
            System.out.println("1. Commencer le jeu");
            System.out.println("2. Créer un personnage");
            System.out.println("3. Modifier un personnage");
            System.out.println("4. Info du personnage");
            System.out.println("5. Quitter le jeu");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            if (choix >= 1 && choix <= 5) {
                switch (choix) {
                    case 2:
                        createPerson();
                        personnageCree = true;
                        break;
                    case 3:
                        if (personnageCree) {
                            modifyPerson();
                        } else {
                            System.out.println("Vous devez créer un personnage pour le modifier !");
                        }
                        break;
                    case 4:
                        infos();
                        break;
                    case 5:
                        System.out.println("À bientôt sur Donjons & Dragons !");
                        continuerJeu = false;
                        break;
                    case 1:
                        if (personnageCree) {
                            System.out.println("Le jeu commence, vous êtes commencer sur la case 1 : !");
                            game.movePlayer();
                        } else {
                            System.out.println("Vous devez créer un personnage pour lancer une partie !");
                        }
                        break; // Ajout de break pour sortir du switch case
                }
            } else {
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
        return false;
    }

    // Création du personnage
    public void createPerson() {
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
            }
        }
        System.out.println("Vous êtes maintenant un " + personnage.getType());
    }

    // Afficher les infos du personnage
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

    // Modifier le personnage
    public void modifyPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String name = input.nextLine().toUpperCase();
        while (true) {
            System.out.println("Entre le type (WARRIOR ou MAGE): ");
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

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    //MESSAGE MAIN
// Message de bienvue utilise dans le main.java
    public void display(String message) {
        System.out.println(message);
    }
    //MESSAGE GAME
// Affiche le déplacement de joueur
    public void displacementPlayer(String message) {
        System.out.println(message);
    }

    // Affiche  fin de la parti (Gagner)
    public void end(String message) {
        System.out.println(message);
    }
    // affiche si le joueur veut rejouer
    public void restart(String message) {
        System.out.println(message);
    }
    // affiche pour remercier le joueur
    public void thanks(String message) {
        System.out.println(message);
    }

    public void exception(String message) {
        System.out.println(message);
    }

    public void enemyEncounter(String message) {
        System.out.println(message);
    }

    public void de(String message){
        System.out.println(message);
    }

    public void casePotion(String message){
        System.out.println(message);
    }
}




