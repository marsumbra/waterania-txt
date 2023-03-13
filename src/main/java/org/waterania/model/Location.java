package org.waterania.model;

public class Location {
    int x;
    int y;
    int z;
    public String description;
    public Biome biome;
    Entity citizens [];

    public Location(int x, int y,int z, String description, Biome biome){
        this.x = x;
        this.y = y;
        this.z = z;
        this.description = description;
    }

    public Location(int x, int y,int z, String description, Biome biome, Entity [] citizens){
        this.x = x;
        this.y = y;
        this.z = z;
        this.description = description;
        this.citizens = citizens;
    }


}
