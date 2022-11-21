package org.waterania.engine;

import org.waterania.model.Location;
import org.waterania.model.Entity;


public class Runner {

    public static Location[] createWorld(){
        Entity japanMedivalCityCitizens[] = new  Entity[2];
        japanMedivalCityCitizens [0] = new Entity(100,100,"big hour glass", 0,0,0,0,false);
        japanMedivalCityCitizens [1] = new Entity(20,20,"samurai",1,1,1,0,false);
        Location world[] = new Location[9];
        world[0] = new Location(0,0,0,"japan medivan city", japanMedivalCityCitizens);
        world [1] = new Location(0,10,0,"very big forest");
        return world;
    }

    public static void main(String[] args){

        Location world[] = createWorld();
        System.out.println("You wake up");

    }
}
