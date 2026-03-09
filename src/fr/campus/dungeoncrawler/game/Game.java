package fr.campus.dungeoncrawler.game;

import fr.campus.dungeoncrawler.dice.Dice;
import fr.campus.dungeoncrawler.character.Character;

import java.util.Scanner;

public class Game {

    private Dice dice;
    private Board board;
    private Character player;
    private Scanner scanner;

    public Game(Dice dice, Scanner scanner) {
        this.dice = dice;
        this.scanner = scanner;
    }

    public void startGame(Character player) {
            initGame(player);
            while (!checkWin()) {
                loop();
            }
            board.print();
            System.out.println("On a gagné !");
    }

    public void initGame(Character player) {
        this.player = player;
        board = new Board(64);
        board.setTile(0, player);
    }

    public void loop() {
        board.print();
        int roll = dice.roll(6);
        board.moveCharacter(roll);
        this.scanner.nextLine();
    }

    public boolean checkWin() {
        return board.getTile(63) == player;
    }
}
