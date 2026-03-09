package fr.campus.dungeoncrawler.dice;

import java.util.Random;

public class Dice {
    Random rand = new Random();

    public int roll(int maxValue) {
        return rand.nextInt(maxValue) + 1;
    }
}
