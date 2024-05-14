package jeu.lancement;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

import jeu.PersonnageHorsPlateauException;
import jeu.personnages.Personnage;
import jeu.plateau.casePlateau.vide.CaseVide;
import jeu.plateau.casePlateau.potion.Potion;
import jeu.plateau.dice.DiceOne;
import jeu.plateau.casePlateau.potion.CasePotion;
import jeu.plateau.casePlateau.ennemi.Dragons;


public class Game {
    Menu menu = new Menu();
    private final Random number = new Random();
    private Personnage personnage;

    public void play() throws PersonnageHorsPlateauException {
        menu.display("Bienvenue dans Donjons & Dragons !");
        menu.menuGame();
    }

//    private final Random random = new Random();

    private Set<Integer> initialiserCasesDragons() {
        Set<Integer> casesDragonsSet = new HashSet<>();
        // Ajouter les positions des dragons au set
        casesDragonsSet.add(45);
        casesDragonsSet.add(52);
        casesDragonsSet.add(56);
        casesDragonsSet.add(62);
        return casesDragonsSet;
    }


    //CaseVide
//    private Set<Integer> initialiserCasesVides() {
//        Set<Integer> casesVidesSet = new HashSet<>();
//        Random random = new Random();
//        while (casesVidesSet.size() < 15) {
//            int caseVide = random.nextInt(64) + 1;
//            casesVidesSet.add(caseVide);
//        }
//        return casesVidesSet;
//    }
//
//    //CasePotion
//    private Set<Integer> initialiserCasesPotion() {
//        Set<Integer> casesPotionSet = new HashSet<>();
//        while (casesPotionSet.size() < 10) {
//            int casePotion = random.nextInt(64) + 1;
//            casesPotionSet.add(casePotion);
//        }
//        return casesPotionSet;
//    }
    private void combattreDragon(Personnage personnage, Dragons dragon) throws PersonnageHorsPlateauException {
        // Afficher le message de rencontre avec le dragon
        menu.dragonEncounter("Vous êtes tombé sur un dragon ! Préparez-vous au combat !");

        // Boucle de combat jusqu'à ce que le joueur ou le dragon soit vaincu
        while (personnage.getPv() > 0 && dragon.getHealth() > 0) {
            // Attaque du joueur sur le dragon
            int degatsInfligesParLeJoueur = personnage.getDamage();
            dragon.takeDamage(degatsInfligesParLeJoueur);

            // Vérifier si le dragon est vaincu
            if (dragon.getHealth() <= 0) {
                menu.end("Vous avez vaincu le dragon ! Félicitations !");
                return; // Sortir de la méthode après avoir vaincu le dragon
            }

            // Attaque du dragon sur le joueur
            int degatsInfligesParLeDragon = 4; // Le dragon inflige 4 dégâts au joueur
            personnage.setPv(personnage.getPv() - degatsInfligesParLeDragon);

            // Vérifier si le joueur est vaincu
            if (personnage.getPv() <= 0) {
                throw new PersonnageHorsPlateauException(); // Lancer une exception si le joueur est vaincu
            }
        }
    }

    public void movePlayer() throws PersonnageHorsPlateauException {
        int currentPosition = 1;
        int finalPosition = 64;
        final DiceOne dice = new DiceOne();
        final CaseVide caseVide = new CaseVide();

//        Set<Integer> casesVides = initialiserCasesVides();
//        Set<Integer> casesPotion = initialiserCasesPotion();
        Set<Integer> casesDragons = initialiserCasesDragons(); // Ajout de l'initialisation des cases de dragons

        try {
            while (currentPosition < finalPosition) {
                int diceRoll = dice.lancer(); // Lancer le dé à chaque tour
                currentPosition += diceRoll;

                menu.de("Vous avez lancé le Dé, résultat : " + diceRoll);
                menu.displacementPlayer("Avancement du joueur : Case " + currentPosition + " / " + finalPosition);

//                if (casesPotion.contains(currentPosition)) {
//                    CasePotion casePotion = new CasePotion();
//                    Potion potion = casePotion.getPotion();
//                    String potionType = potion.getPotionAleatoire();
//                    int pointsDeVie = potion.getPointsDeVie(potionType);
//                    menu.casePotion("Vous avez trouvé une potion : " + potionType + ". Elle vous rend " + pointsDeVie + " points de vie.");
//                }
//
//                if (casesVides.contains(currentPosition)) {
//                    String message = caseVide.afficher(); // Afficher la case vide et relancer le dé
//                    menu.de(message); // Afficher le résultat du dé
//                }

                if (casesDragons.contains(currentPosition)) {
                    menu.dragonEncounter("Vous êtes tombé sur un dragon ! Préparez-vous au combat !");
                    // Gestion du combat avec le dragon
                    Dragons dragon = new Dragons(15); // Le dragon a 15 points de vie
                    while (personnage.getPv() > 0 && dragon.getHealth() > 0) {
                        // Combat entre le joueur et le dragon
                        int playerDamageDealt = personnage.getDamage();
                        dragon.takeDamage(playerDamageDealt);
                        if (dragon.getHealth() > 0) {
                            int dragonDamageDealt = 4; // Le dragon inflige 4 dégâts au joueur
                            personnage.takeDamage(dragonDamageDealt);
                        }
                    }
                    if (personnage.getPv() <= 0) {
                        menu.defeat("Vous avez été vaincu par le dragon. Game Over !");
                        replay(); // Proposer de rejouer après la défaite
                    } else {
                        menu.victory("Vous avez vaincu le dragon !");
                    }
                }

                if (currentPosition > finalPosition) {
                    throw new PersonnageHorsPlateauException();
                }
            }
            menu.end("Félicitations ! Vous avez GAGNÉ !!!!!!!!!!");
            replay(); // Proposer de rejouer après la victoire
        } catch (PersonnageHorsPlateauException e) {
            menu.exception(e.getMessage());
            handleException();
        }
    }



    private void handleException() throws PersonnageHorsPlateauException {
        replay();
    }

    private void replay() throws PersonnageHorsPlateauException {
        menu.restart("Voulez-vous rejouer ? (yes or no)");
        String response = menu.getUserInput();

        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            movePlayer(); // Appel récursif pour rejouer
        } else {
            menu.thanks("Merci d'avoir joué :)");
        }
    }


}