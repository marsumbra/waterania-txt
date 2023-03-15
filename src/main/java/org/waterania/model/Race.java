package org.waterania.model;

public class Race extends Entity{
    public String raceName;
    public Race(String raceName, int maxHP, int currentHP, String name, int id, int x, int y, int z, boolean evil,
                int strength, int agility, int body, int reaction, int constitution, int wisdom, int intelligence,
                int spirit, int morale, int charisma) {
        super(maxHP, currentHP, name, id, x, y, z, evil, strength, agility, body, reaction, constitution, wisdom,
                intelligence, spirit, morale, charisma);
        this.raceName=raceName;
    }

    public Player modify(Entity player){
        player.maxHP+=this.maxHP;
        player.constitution+=this.constitution;
        player.strength=this.strength;
        player.body+=this.body;
        player.agility+=this.agility;
        player.reaction+=this.reaction;
        player.wisdom+=this.wisdom;
        player.intelligence+=this.intelligence;
        player.spirit+=this.spirit;
        player.charisma=this.charisma;
        return new Player(player.maxHP, player.currentHP, player.name, player.id, player.x, player.y, player.z, player.evil,
                0, 0, player.strength, player.agility, player.body, player.reaction, player.constitution, player.wisdom,
                player.intelligence, player.spirit, player.morale, player.charisma);

    }
}
