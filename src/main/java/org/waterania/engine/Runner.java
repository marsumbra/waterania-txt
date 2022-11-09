package org.waterania.engine;

import org.waterania.model.Location;

public class Runner {

    public static Location[] createWorld(){
        Location world[] = new Location[100];
        world[0] = new Location(0,0,0,"Strange blue meadow");
        return world;
    }

    public static void main(String[] args){

        Location world[] = createWorld();

        System.out.println("You wake up");
    }
}
