package org.waterania.model;

public class Weapon extends Item {
    int durability;
    int damage;
    String craftsman;
    WeaponTypes type;

    public Weapon(int id, int price, String name,int durability, int damage, String craftsman, WeaponTypes type){
        super(id,price,name);
        this.damage=damage;
        this.craftsman=craftsman;
        this.durability=durability;
        this.type = type;
    }
}
