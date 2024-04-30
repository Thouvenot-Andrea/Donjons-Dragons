# Donjons-Dragons

ETAPE 1 :

        Creations des classes:
            EquipementOffensif
            Personnage
            EquipementDefensif
            Menu
            Game

        Personnage aura 3 contructeur :
            1-sans paramètres
            2-avec nom
            3-tous

        EquipementOffensif sera caratérisé par un type:
            String arme ou sort

        EquipentDenfensif sera caratérisé par un type:
            String Bouclier ou Philtre

        Menu:
            Permet de structurer le déroulement du jeux et les messages

        Game:
            contient la logique interne du jeu(joueurs,avancement)

        ATTENTION il faut le structuré correctement , il faut utliser:
            -GETTER
            -SETTER
            -CONSTRUCTEURS
            -TOSTRING

         1- Dabord il faut creer les personnes Mage et Guerrier:
        
            ● Guerrier : Nom, Niveau de vie (10), Force d’attaque (10), EquipementOffensif,
                EquipementDefensif
            ●  Magicien : Nom, Niveau de vie (6), Force d’attaque (15), EquipementOffensif,
                EquipementDefensif

            Faire un class Main qui appelle la class Game et Menu
            Les system.out.println que dans la class Menu.

         2-Après il faut créer les déplacements du joueur,ajouter un bouton au menu pour lancer la partie
           
