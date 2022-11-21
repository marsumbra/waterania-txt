package org.waterania.model;

public class Entity {
    int maxHP;
    int currentHP;
    String name;
    int id;
    int x;
    int y;
    int z;

    boolean evil;
    Armor armor;
    Weapon weapon;
    public Entity(int maxHP, int currentHP, String name, int id, int x, int y, int z, boolean evil) {
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.name = name;
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.evil = evil;
    }
}
