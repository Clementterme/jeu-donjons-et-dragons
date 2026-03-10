package fr.campus.dungeoncrawler.items;

public abstract class DefensiveEquipment {

    private String name;
    private int hp;

    public DefensiveEquipment(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
