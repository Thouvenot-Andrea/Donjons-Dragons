package jeu.plateau.casePlateau.arme;


public abstract class Arme implements CaseArme{
    private final int armeDamage;

    public Arme(int armeDamage) {
        this.armeDamage = armeDamage;
    }

    public int getArmeDamage() {
        return armeDamage;
    }

    @Override
    public int ArmeDamage() {
        return armeDamage;
    }

}