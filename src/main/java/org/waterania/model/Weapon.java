package org.waterania.model;

public class Weapon extends Item {
    int durability;
    int damage;
    String craftsman;

    public Weapon(int id, int price, String name,int durability, int damage, String craftsman){
        super(id,price,name);
        this.damage=damage;
        this.craftsman=craftsman;
        this.durability=durability;
    }
}
