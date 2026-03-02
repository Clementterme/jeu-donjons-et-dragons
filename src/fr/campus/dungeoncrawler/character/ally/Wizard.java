package fr.campus.dungeoncrawler.character.ally;

import fr.campus.dungeoncrawler.character.Character;

public class Wizard extends Character {
    private String name;

    public Wizard(String name) {
        this.name = name;
        this.health = 8;
        this.attack = 6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
