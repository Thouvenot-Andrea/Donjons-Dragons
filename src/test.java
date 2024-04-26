//import java.util.Scanner;
//
//public class test {
//    // Attribute
//    String nom;
//    int niveauDeVie;
//    int forceDAttaque;
//    String equipementOffensif;
//    String equipementDefensif;
//
//    //Constructor
//    public Personnage(String nom, int niveauDeVie, int forceDAttaque, String equipementOffensif, String equipementDefensif) {
//        this.nom = nom;
//        this.niveauDeVie = niveauDeVie;
//        this.forceDAttaque = forceDAttaque;
//        this.equipementOffensif = equipementOffensif;
//        this.equipementDefensif = equipementDefensif;
//    }
//
//    public static void main(String[] args) {
//        Scanner choice = new Scanner(System.in);
//        String choix = "";
//        while (!choix.equals("1") && !choix.equals("2")) {
//            System.out.println("=== MENU ===");
//            System.out.println("1. Nouveau personnage");
//            System.out.println("2. Quitter le jeu");
//            System.out.print("Votre choix : ");
//            choix = choice.nextLine(); // Read user input
//
//            switch (choix) {
//                case "1":
//                    System.out.println("Création d'un nouveau personnage...");
//                    break;
//                case "2":
//                    System.out.println("Merci d'avoir joué !");
//                    break;
//                default:
//                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
//                    break;
//            }
//        }
//        if (choix.equals("1")) {
//            boolean characterSelected = false;
//            while (!characterSelected) {
//                Scanner myObj = new Scanner(System.in);
//                String userName;
//                System.out.println("Enter username");
//                userName = myObj.nextLine();
//
//                Scanner myObj2 = new Scanner(System.in);
//                String character;
//                System.out.println("jeu.personnages.Warrior or jeu.personnages.Magician");
//                character = myObj2.nextLine();
//
//
//                if (character.equals("jeu.personnages.Magician")) {
//                    Personnage jeu.personnages.Magician = new Personnage(userName, 6, 15, "sort", "philtre");
//                    System.out.println("Nom :" + jeu.personnages.Magician.nom);
//                    System.out.println("Niveau de vie : " + jeu.personnages.Magician.niveauDeVie);
//                    System.out.println("Force d'attaque : " + jeu.personnages.Magician.forceDAttaque);
//                    System.out.println("Equipement Offensif : " + jeu.personnages.Magician.equipementOffensif);
//                    System.out.println("Equipement Défensif : " + jeu.personnages.Magician.equipementDefensif);
//                    characterSelected = true;
//                } else if (character.equals("jeu.personnages.Warrior")) {
//                    Personnage jeu.personnages.Warrior = new Personnage(userName, 10, 10, "arme", "bouclier");
//                    System.out.println("Nom :" + jeu.personnages.Warrior.nom);
//                    System.out.println("Niveau de vie : " + jeu.personnages.Warrior.niveauDeVie);
//                    System.out.println("Force d'attaque : " + jeu.personnages.Warrior.forceDAttaque);
//                    System.out.println("Equipement Offensif : " + jeu.personnages.Warrior.equipementOffensif);
//                    System.out.println("Equipement Défensif : " + jeu.personnages.Warrior.equipementDefensif);
//                    characterSelected = true;
//                } else {
//                    System.out.println("Le personnage nest pas bon ");
//                }
//            }
//        }
//    }
//}
//




