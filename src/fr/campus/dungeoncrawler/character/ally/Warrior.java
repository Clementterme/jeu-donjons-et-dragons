package fr.campus.dungeoncrawler.character.ally;

import fr.campus.dungeoncrawler.character.Character;

public class Warrior extends Character {
    private String name;
    private Character character;

    public Warrior(String name) {
        this.name = name;
        this.health = 10;
        this.attack = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
