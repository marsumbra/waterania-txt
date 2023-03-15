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
    public int strength;
    public int agility;
    public int body;
    public int reaction;
    public int constitution;
    public int wisdom;
    public int intelligence;
    public int spirit;
    public int morale;
    public int charisma;

    boolean evil;
    Armor armor;
    Weapon weapon;
    List<Item> inventory = new ArrayList();
    public Entity(int maxHP, int currentHP, String name, int id, int x, int y, int z, boolean evil, int strength,
                  int agility, int body, int reaction, int constitution, int wisdom, int intelligence, int spirit,
                  int morale, int charisma) {
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.name = name;
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.evil = evil;
        this.strength = strength;
        this.agility=agility;
        this.body=body;
        this.reaction=reaction;
        this.constitution=constitution;
        this.wisdom=wisdom;
        this.intelligence=intelligence;
        this.spirit=spirit;
        this.morale=morale;
        this.charisma=charisma;
    }
}
