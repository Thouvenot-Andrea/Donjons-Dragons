import java.util.Scanner;

public class Personnage {
    String name;
    String type;

    public Personnage() {

    }

    public Personnage(String name) {
        this.name = name;
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + name);
        System.out.println("Type: " + type);
    }


    public void modificationInfos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nouveau nom du personnage : ");
        String newName = scanner.nextLine();

        System.out.println("Entrez le nouveau type du personnage (Warrior ou Magician) : ");
        String newType = scanner.nextLine();

        this.name = newName;
        this.type = newType;
    }


    public String createPersonnage(String choix) {
        if (choix.equals("1")) {
            boolean characterSelected = false;
            Scanner scanner = new Scanner(System.in);

            while (!characterSelected) {
                System.out.println("Enter username");
                name = scanner.nextLine();

                System.out.println("Warrior or Magician");
                type = scanner.nextLine();

                if (type.equals("Magician") || type.equals("Warrior")) {
                    characterSelected = true;
                } else {
                    System.out.println("Invalid type. Please enter either 'Warrior' or 'Magician'.");
                }
            }

            if (type.equals("Magician")) {
                Personnage magician = new Personnage(name, "Magician");
            } else {
                Personnage warrior = new Personnage(name, "Warrior");
            }

        }
        return "Nom: " + name + ", Type: " + type;
    }
}

