package org.waterania.model;

public class Player extends Entity {
    int xp;
    int sp;

    public Player(int maxHP, int currentHP, String name, int id, int x, int y, int z, boolean evil, int xp, int sp) {
        super(maxHP, currentHP, name, id, x, y, z, evil);
        this.xp = xp;
        this.sp = sp;
    }
}
