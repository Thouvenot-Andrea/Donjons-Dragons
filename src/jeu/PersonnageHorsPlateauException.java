package jeu;

public class PersonnageHorsPlateauException extends Exception {
    public PersonnageHorsPlateauException() {
        super("Le personnage est hors du plateau !");
    }
}
