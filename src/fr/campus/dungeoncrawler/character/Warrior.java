package fr.campus.dungeoncrawler.character;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 10, 5);
    }

    @Override
    public void displayStats() {
        System.out.println("Classe : Guerrier");
        System.out.println("Nom : " + getName());
        System.out.println("Vie : " + getHp());
        System.out.println("Attaque : " + getAttack());
    }

    @Override
    public String toString() {
        return "⚔\uFE0F\uD83D\uDEE1\uFE0F";
    }
}
