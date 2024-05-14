package jeu.plateau.casePlateau.ennemi;

import jeu.personnages.Personnage;

public class Dragons implements Ennemi {
    private int health;

    public Dragons(int health) {
        this.health = health;
    }

    // Méthode pour infliger des dégâts au dragon
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // Assurez-vous que la santé du dragon ne devienne pas négative
        }
    }

    // Méthode pour récupérer les points de vie actuels du dragon
    public int getHealth() {
        return health;
    }

    @Override
    public String afficher() {
        return "Dragon"; //
    }

    //    @Override
//    public void interagir(Personnage personnage) {
//        while (personnage.getPv() > 0 && this.getHealth() > 0) {
//            // Combat entre le joueur et le dragon
//            int playerDamageDealt = personnage.getDamage();
//            takeDamage(playerDamageDealt);
//            if (getHealth() > 0) {
//                int dragonDamageDealt = 4; // Le dragon inflige 4 dégâts au joueur
//                personnage.takeDamage(dragonDamageDealt);
//            }
//        }
//    }
    @Override
    public String interagir(Personnage personnage) {
        StringBuilder combatResult = new StringBuilder();

        combatResult.append("Début du combat avec le dragon!\n");

        while (personnage.getPv() > 0 && this.getHealth() > 0) {
            // Combat entre le joueur et le dragon
            int playerDamageDealt = personnage.getDamage();
            takeDamage(playerDamageDealt);
            combatResult.append("---Vous infligez ").append(playerDamageDealt).append(" dégâts au dragon.---\n");

            if (getHealth() > 0) {
                int dragonDamageDealt = 4; // Le dragon inflige 4 dégâts au joueur
                personnage.takeDamage(dragonDamageDealt);
                combatResult.append("---Le dragon vous inflige ").append(dragonDamageDealt).append(" dégâts.---\n");
            }
        }

        return combatResult.toString();
    }


}
