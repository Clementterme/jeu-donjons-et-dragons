package fr.campus.dungeoncrawler.character;

public class Wizard extends Character {

    public Wizard(String name) {
        super(name, 8, 6);
    }

    @Override
    public void displayStats() {
        System.out.println("Classe : Magicien");
        System.out.println("Nom : " + getName());
        System.out.println("Vie : " + getHp());
        System.out.println("Attaque : " + getAttack());
    }

    @Override
    public String toString() {
        return "\uD83E\uDDD9\uD83C\uDFFB\u200D♂\uFE0F";
    }
}
