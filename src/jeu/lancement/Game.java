package jeu.lancement;

import java.util.Random;

import jeu.PersonnageHorsPlateauException;
import jeu.personnages.Personnage;
import jeu.plateau.Plateau;
import jeu.plateau.casePlateau.Case;
import jeu.plateau.casePlateau.ennemi.CaseEnnemi;
import jeu.plateau.dice.DiceOne;


public class Game {
    private final Random number = new Random();

    private final Personnage personnage;
    private final Menu menu;
    private final Plateau plateau;
    private final DiceOne dice;

    public Game(Plateau plateau, Personnage personnage, Menu menu) {
        this.plateau = plateau;
        this.personnage = personnage;
        this.menu = menu;
        dice = new DiceOne();
    }

    public void play() {
        int currentPosition = 1;
        int finalPosition = 64;
        boolean playerWon = false;
        try {
            while (currentPosition < finalPosition) {
                currentPosition = movePersonnage(currentPosition);

                Case gameCase = plateau.getCase(currentPosition);

                menu.displacementPlayer(currentPosition, finalPosition);
                menu.heroLandsOnCase(gameCase);

                if (gameCase instanceof CaseEnnemi) {
                    CaseEnnemi ennemi = (CaseEnnemi) gameCase;
                    String combatResult = ennemi.interagir(personnage);
                    menu.showCombatResult(combatResult); // Afficher les informations du combat
                    if (personnage.getPv() <= 0) {
                        menu.defeat("Vous avez été vaincu. Game Over !");
                        return; // Laisser la logique de redémarrage au main
                    }
                } else {
                    gameCase.interagir(personnage);
                }

                if (personnage.getPv() <= 0) {
                    menu.defeat("Vous avez été vaincu. Game Over !");
                    return;
                }

            }
            playerWon = true;
        } catch (PersonnageHorsPlateauException e) {
            menu.exception(e.getMessage());
        }
        if (playerWon) {
            menu.end("Félicitations ! Vous avez GAGNÉ !!!!!!!!!!");
        }

    }

    private int movePersonnage(int currentPosition) throws PersonnageHorsPlateauException {
        int diceRoll = dice.lancer();
        menu.de(diceRoll);
        int newPosition = currentPosition + diceRoll;

        if (currentPosition >= plateau.size() - 1) {
            throw new PersonnageHorsPlateauException();
        }

        return newPosition;
    }

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
//    private void combattreDragon(Personnage personnage, Dragons dragon) throws PersonnageHorsPlateauException {
//        // Afficher le message de rencontre avec le dragon
//        menu.dragonEncounter("Vous êtes tombé sur un dragon ! Préparez-vous au combat !");
//
//        // Boucle de combat jusqu'à ce que le joueur ou le dragon soit vaincu
//        while (personnage.getPv() > 0 && dragon.getHealth() > 0) {
//            // Attaque du joueur sur le dragon
//            int degatsInfligesParLeJoueur = personnage.getDamage();
//            dragon.takeDamage(degatsInfligesParLeJoueur);
//
//            // Vérifier si le dragon est vaincu
//            if (dragon.getHealth() <= 0) {
//                menu.end("Vous avez vaincu le dragon ! Félicitations !");
//                return; // Sortir de la méthode après avoir vaincu le dragon
//            }
//
//            // Attaque du dragon sur le joueur
//            int degatsInfligesParLeDragon = 4; // Le dragon inflige 4 dégâts au joueur
//            personnage.setPv(personnage.getPv() - degatsInfligesParLeDragon);
//
//            // Vérifier si le joueur est vaincu
//            if (personnage.getPv() <= 0) {
//                throw new PersonnageHorsPlateauException(); // Lancer une exception si le joueur est vaincu
//            }
//        }
//    }


//        Set<Integer> casesVides = initialiserCasesVides();
//        Set<Integer> casesPotion = initialiserCasesPotion();
//        Set<Integer> casesDragons = initialiserCasesDragons(); // Ajout de l'initialisation des cases de dragons


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

//                if (casesDragons.contains(currentPosition)) {
//                    menu.dragonEncounter("Vous êtes tombé sur un dragon ! Préparez-vous au combat !");
//                    // Gestion du combat avec le dragon
//                    Dragons dragon = new Dragons(15); // Le dragon a 15 points de vie
//                    while (personnage.getPv() > 0 && dragon.getHealth() > 0) {
//                        // Combat entre le joueur et le dragon
//                        int playerDamageDealt = personnage.getDamage();
//                        dragon.takeDamage(playerDamageDealt);
//                        if (dragon.getHealth() > 0) {
//                            int dragonDamageDealt = 4; // Le dragon inflige 4 dégâts au joueur
//                            personnage.takeDamage(dragonDamageDealt);
//                        }
//                    }
//                }

//    }


//}