package com.qa;

public class Main {
    public static void main(String[] args) {

        Character bob = new Character();
        bob.setHealth(10);
        bob.setPosition(4, 22);

        // Stored as an int array
        int xPosition = bob.getPosition()[0];
        int yPosition = bob.getPosition()[1];

        System.out.println(xPosition);
        System.out.println(yPosition);

        Character megan = new Character(5, 7, 7, 6, 2, 10, "Megan");

        System.out.println(megan);

        System.out.println(megan.rollDice());

        PlayableCharacter michael = new PlayableCharacter();
        michael.setExpPoints(13);

        System.out.println(michael.rollDice());

        Character[] characters = {bob, megan, michael};

        for (Character c : characters) {
            System.out.println(c);
        }

    }
}