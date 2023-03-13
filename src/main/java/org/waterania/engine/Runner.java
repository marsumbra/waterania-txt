package org.waterania.engine;

import org.waterania.model.*;


import java.util.Scanner;

public class Runner {

    /*public static Location[][] createWorld(){
        Entity japanMedivalCityCitizens[] = new  Entity[2];
        japanMedivalCityCitizens [0] = new Entity(100,100,"big hour glass", 0,0,0,0,false);
        japanMedivalCityCitizens [1] = new Entity(20,20,"samurai",1,1,1,0,false);
        Location[][] world = WorldGenerator.generateMapLevel(0);
        return world;
    }*/

    public static void main(String[] args){

        Location[][] world = WorldGenerator.generateMapLevel(0);
        System.out.println("You wake up");
        Player player = new Player(100,100,"advencturer", 0,5,5,0, false,0,0);
        System.out.println(world[player.x][player.y].description);
        Scanner keyboard = new Scanner(System.in);

        try {
            while (player.currentHP > 0) {

                System.out.println("Where do you go?");
                String command = keyboard.nextLine();

                switch (command) {
                    case "n":
                        player.x++;
                        break;
                    case "s":
                        player.x--;
                        break;
                    case "w":
                        player.y--;
                        break;
                    case "e":
                        player.y++;
                        break;
                }

                System.out.println(world[player.x][player.y].description);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have fallen through the edge the world");
        }

    }

    Item iron = new Item(002,1,"iron");
    Weapon iron_sword = new Weapon(001,50,"iron_sword", 30,10,"blacksmith");

}
