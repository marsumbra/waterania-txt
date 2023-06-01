package org.waterania.model;

public class Player extends Entity {

    int sp;

    public AdventurerClass adventurerClass = null;

    public Player(int maxHP, int currentHP, String name, int id, int x, int y, int z, boolean evil, int xp, int sp,
                  int strength, int agility, int body, int reaction, int constitution, int wisdom, int intelligence,
                  int spirit, int morale, int charisma,int xp) {
        super(maxHP, currentHP, name, id, x, y, z, evil,strength,agility, body,reaction,constitution,wisdom,
                intelligence,spirit,morale,charisma,xp);
        this.sp = sp;
    }

    public void assignClass(AdventurerClass adventurerClass) {
        this.adventurerClass = adventurerClass;
    }
}
