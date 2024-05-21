package jeu.plateau.casePlateau.ennemi;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;


public abstract class Ennemi implements CaseEnnemi {
    protected int pv;

    public Ennemi(int pv) {
        this.pv = pv;
    }

    public void takeDamage(int damage) {
        pv -= damage;
        if (pv < 0) {
            pv = 0;
        }
    }

    public int getPv(){
        return this.pv;
    };

    public abstract int ennemiDamageDealt();

    public abstract String afficher();

    public void interagirAvecJoueur(Personnage personnage, Menu menu) {
        StringBuilder combatResult = new StringBuilder();
        combatResult.append("Début du combat avec ").append(afficher()).append("\n");

        while (personnage.getPv() > 0 && this.getPv() > 0) {
            int playerDamageDealt = personnage.getDamage();
            this.takeDamage(playerDamageDealt);
            combatResult.append("---Vous infligez ").append(playerDamageDealt).append(" dégâts à ").append(afficher()).append(".---\n");

            if (this.getPv() > 0) {
                int ennemiDamageDealt = ennemiDamageDealt(); // Vous pouvez ajuster les dégâts ici
                personnage.takeDamage(ennemiDamageDealt);
                combatResult.append("---").append(afficher()).append(" vous inflige ").append(ennemiDamageDealt).append(" dégâts.---\n");
            }
        }

        combatResult.append("---Il vous reste ").append(personnage.getPv()).append(" Pv\n");
        menu.showCombatResult(combatResult.toString());
    }


}
