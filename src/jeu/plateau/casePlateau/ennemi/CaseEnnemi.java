package jeu.plateau.casePlateau.ennemi;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;
import jeu.plateau.casePlateau.Case;

public interface CaseEnnemi extends Case {

    void interagirAvecJoueur(Personnage personnage, Menu menu);

    void takeDamage(int damage);


}