package com.qa;
import java.util.Random;

public abstract class Character {
    private String name;
    private int health;
    private int level;
    private int mana;
    private String[] inventory = new String[5];
    private int movement;
    private int xPosition;
    private int yPosition;
    private static final Random rand = new Random();

    public static int rollDice() {
        return rand.nextInt(1, 13);
    }

    public Character() {
        this(0, 0, 5, 1, 1, 10, "Unknown");
    }

    public Character(int yPosition, int xPosition, int movement, int mana, int level, int health, String name) {
        this.setName(name);
        this.setHealth(health);
        this.setLevel(level);
        this.setMana(mana);
        this.setMovement(movement);
        this.setPosition(xPosition, yPosition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int[] getPosition() {
        return new int[]{xPosition, yPosition};
    }

    public void setPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public abstract void doDamage(Character target);



    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", movement=" + movement +
                ", position=" + "(" + getPosition()[0] + "," + getPosition()[1] + ")" +
                ", mana=" + mana +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
