import jeu.lancement.Game;
import jeu.lancement.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        while (menu.menuGame()) {

            Game game = new Game(menu);
            menu.display("Welcome to Donjons & Dragons!");
            game.play();
        }
    }
}

