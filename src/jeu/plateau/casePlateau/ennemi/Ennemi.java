package jeu.plateau.casePlateau.ennemi;

import jeu.personnages.Personnage;
import jeu.plateau.casePlateau.ennemi.CaseEnnemi;

public abstract class Ennemi implements CaseEnnemi {
    protected int health;

    public Ennemi(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public abstract String afficher();

    public String interagir(Personnage personnage) {
        StringBuilder combatResult = new StringBuilder();
        combatResult.append("Début du combat avec ").append(afficher()).append("\n");

        while(personnage.getPv() > 0 && this.getHealth() > 0) {
            int playerDamageDealt = personnage.getDamage();
            takeDamage(playerDamageDealt);
            combatResult.append("---Vous infligez ").append(playerDamageDealt).append(" dégâts à ").append(afficher()).append(".---\n");

            if (getHealth() > 0) {
                int ennemiDamageDealt = 2; // Vous pouvez ajuster les dégâts ici
                personnage.takeDamage(ennemiDamageDealt);
                combatResult.append("---").append(afficher()).append(" vous inflige ").append(ennemiDamageDealt).append(" dégâts.---\n");
            }
        }

        combatResult.append("---Il vous reste ").append(personnage.getPv()).append(" Pv");

        return combatResult.toString();
    }

}
