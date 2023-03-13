package org.waterania.model;

public class Armor extends Item {
    public int durabilyty;
    public int defence;
public Armor(int id, int price, String name,int durability, int defence) {
    super(id,price,name);
    this.durabilyty = durability;
    this.defence = defence;
}


}
