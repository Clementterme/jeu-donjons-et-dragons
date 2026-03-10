package fr.campus.dungeoncrawler.items;

public abstract class OffensiveEquipment {

    private String name;
    private int attack;

    public OffensiveEquipment(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
