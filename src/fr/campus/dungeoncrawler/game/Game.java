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

    public void startGame(Character player, Scanner sc) {
        initGame(player);
        while (!checkWin()) {
            loop();
        }
        board.print();
        System.out.println("On a gagné !");

        int choix = 0;

        while (choix != 2) {
            System.out.println("1 - Recommencer une partie");
            System.out.println("2 - Quitter le jeu");
            System.out.print("Votre choix : ");

            // Vérification du type int
            if (sc.hasNextInt()) {
                choix = sc.nextInt();
            } else {
                System.out.println("Veuillez entrer un nombre valide !");
                sc.next();
                continue;
            }

            sc.nextLine();

            switch (choix) {
                case 1:
                    startGame(player, sc);
                case 2:
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }

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
