package org.waterania.model;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    public int maxHP;
    public int currentHP;
    public String name;
    int id;
    public int x;
    public int y;
    public int z;

    boolean evil;
    Armor armor;
    Weapon weapon;
    List<Item> inventory = new ArrayList();
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
