package fr.campus.dungeoncrawler.items;

public class DefensiveEquipment {
    private String type;
    private String name;
    private int health;

    public DefensiveEquipment(String type, String name, int health) {
        this.type = type;
        this.name = name;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
