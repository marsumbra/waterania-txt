package org.waterania.engine;

import org.waterania.model.Biome;
import org.waterania.model.Location;

import java.util.Random;

public class WorldGenerator {

    static int MAXX = 20;
    static int MAXY = 20;

    static Location[][] generateMapLevel(int level){
        Random rand = new Random();
        Location[][] world = new Location[MAXX][MAXY];
        for(int i=0;i<MAXX;i++){
            for(int j=0;j<MAXY;j++){
                Biome[] biomesTable = Biome.values();
                Biome biome = biomesTable[rand.nextInt(biomesTable.length)];
                world[i][j] = new Location(i,j,level,biome.toString(),biome);
                System.out.println(world[i][j].description);
            }
        }
        return world;
    }
}
