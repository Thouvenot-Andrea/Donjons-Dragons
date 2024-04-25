import java.util.Scanner;

public class Personnage {

    String nom;
    int niveauDeVie;
    int forceDAttaque;
    String equipementOffensif;
    String equipementDefensif;

    public Personnage(String nom, int niveauDeVie, int forceDAttaque, String equipementOffensif, String equipementDefensif) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceDAttaque = forceDAttaque;
        this.equipementOffensif = equipementOffensif;
        this.equipementDefensif = equipementDefensif;
    }



    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        System.out.println("Enter username");
        userName = myObj.nextLine();

        Scanner myObj2 = new Scanner(System.in);
        String character;
        System.out.println("Warrior or Magician");
        character = myObj2.nextLine();


        if (character.equals("Magician")) {
            Personnage Magician = new Personnage(userName, 6, 15, "sort", "philtre");
            System.out.println("Nom :" + Magician.nom);
            System.out.println("Niveau de vie : " + Magician.niveauDeVie);
            System.out.println("Force d'attaque : " + Magician.forceDAttaque);
            System.out.println("Equipement Offensif : " + Magician.equipementOffensif);
            System.out.println("Equipement Défensif : " + Magician.equipementDefensif);
        } else if (character.equals("Warrior")) {
            Personnage Warrior = new Personnage(userName, 10, 10, "arme", "bouclier");
            System.out.println("Nom :" + Warrior.nom);
            System.out.println("Niveau de vie : " + Warrior.niveauDeVie);
            System.out.println("Force d'attaque : " + Warrior.forceDAttaque);
            System.out.println("Equipement Offensif : " + Warrior.equipementOffensif);
            System.out.println("Equipement Défensif : " + Warrior.equipementDefensif);
        } else {
            System.out.println("Le personnage nest pas bon ");
        }
    }
}


