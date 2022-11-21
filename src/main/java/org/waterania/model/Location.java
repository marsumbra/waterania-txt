package org.waterania.model;

public class Location {
    int x;
    int y;
    int z;
    String description;
    Entity citizens [];

    public Location(int x, int y,int z, String description){
        this.x = x;
        this.y = y;
        this.z = z;
        this.description = description;
    }

    public Location(int x, int y,int z, String description, Entity [] citizens){
        this.x = x;
        this.y = y;
        this.z = z;
        this.description = description;
        this.citizens = citizens;
    }


}
