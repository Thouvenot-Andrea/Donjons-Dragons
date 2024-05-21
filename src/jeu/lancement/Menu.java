package jeu.lancement;

import java.util.Scanner;

import jeu.PersonnageHorsPlateauException;
import jeu.personnages.Mage;
import jeu.personnages.Personnage;
import jeu.personnages.Warrior;
import jeu.plateau.casePlateau.Case;

public class Menu {

    private Personnage personnage;
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // MENU
    public Personnage menuGame() throws PersonnageHorsPlateauException {
        boolean personnageCree = false;
        boolean continuerJeu = true;

        while (continuerJeu) {
            System.out.println("1. Commencer le jeu");
            System.out.println("2. Créer un personnage");
            System.out.println("3. Modifier un personnage");
            System.out.println("4. Info du personnage");
            System.out.println("5. Quitter le jeu");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

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
                            return personnage;
                        } else {
                            System.out.println("Vous devez créer un personnage pour lancer une partie !");
                        }
                        break; // Ajout de break pour sortir du switch case
                }
            } else {
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
        return null;
    }

    // Création du personnage
    public void createPerson() {
        System.out.println("Bienvenue dans Donjons & Dragons !");

        // Demander et obtenir le nom du personnage
        System.out.println("Entrez votre nom : ");
        String nom = scanner.nextLine().toUpperCase();

        // Demander et obtenir le type du personnage
        String typeStr;
        do {
            System.out.println("Entrez votre type (WARRIOR ou MAGE) : ");
            typeStr = scanner.nextLine().toUpperCase();
        } while (!typeStr.equals("WARRIOR") && !typeStr.equals("MAGE"));

        // Créer le personnage en fonction du type saisi
        switch (typeStr) {
            case "WARRIOR":
                personnage = new Warrior(nom);
                break;
            case "MAGE":
                personnage = new Mage(nom);
                break;
        }

        // Afficher un message de confirmation
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
        System.out.println("Entrez votre nom : ");
        String name = scanner.nextLine().toUpperCase();
        while (true) {
            System.out.println("Entre le type (WARRIOR ou MAGE): ");
            String type = scanner.nextLine().toUpperCase();
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
        return scanner.next();
    }
    //MESSAGE MAIN
    public void display(String message) {
        System.out.println(message);
    }
    //MESSAGE GAME
    public void displacementPlayer(int currentPosition, int finalPosition) {
        System.out.println("Avancement du joueur : Case " + currentPosition + " / " + finalPosition+"\n");
    }
    public void end(String message) {
        System.out.println(message);
    }
    public void restart(String message) {
        System.out.println(message);
    }
    public void thanks(String message) {
        System.out.println(message);
    }
    public void exception(String message) {
        System.out.println(message);
    }
    public void de(int value) {
        System.out.println("\nVous avez lancé le Dé, résultat : " + value);
    }
    public void defeat(String message) {
        System.out.println(message);
    }
    public void heroLandsOnCase(Case gameCase) {
        System.out.println("Le hero est sur une case: " + gameCase.afficher());
    }
    public void showCombatResult(String combatResult) {
        System.out.println(combatResult);
    }




}