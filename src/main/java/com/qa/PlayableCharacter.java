package com.qa;
import java.util.Random;

public class PlayableCharacter extends Character {
    private int ExpPoints;

    public int getExpPoints() {
        return ExpPoints;
    }

    public void setExpPoints(int expPoints) {
        ExpPoints = expPoints;
    }

    @Override
    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(1, 16);

    }

    @Override
    public String toString() {
        return super.toString() + "Playable Character ExpPoints= " + this.getExpPoints();
    }
}
