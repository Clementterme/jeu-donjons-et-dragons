package fr.campus.dungeoncrawler.main;

import fr.campus.dungeoncrawler.character.Character;
import fr.campus.dungeoncrawler.dice.Dice;
import fr.campus.dungeoncrawler.game.Menu;
import fr.campus.dungeoncrawler.game.Game;

import java.util.Scanner;

public class Main {

        static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Menu menu = new Menu();
            Game game = new Game(new Dice(), sc);
            Character player;
            player = menu.mainMenu();
            game.startGame(player);

    }
}
