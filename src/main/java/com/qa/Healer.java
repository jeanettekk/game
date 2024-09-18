package com.qa;

public class Healer extends PlayableCharacter {


    public String getPantheon() {
        return pantheon;
    }

    public void setPantheon(String pantheon) {
        this.pantheon = pantheon;
    }

    private String pantheon;

    public Healer(){
        super();
        this.setPantheon("No pantheon");
    }

    public Healer(int yPosition, int xPosition, int movement, int mana, int level, int health, String name, String pantheon) {
        super(yPosition, xPosition, movement, mana, level, health, name);
        this.setPantheon(pantheon);
    }

    public Healer(String name, String pantheon) {
        super();
        this.setPantheon(pantheon);
        this.setName(name);
    }


    @Override
    public void rest(boolean isLong) {
        if(isLong){
            this.setMana(50);
        } else {
            this.setMana(20);
        }
        this.setHealth(10);
    }

    @Override
    public void doDamage(Character target) {
        target.setHealth(target.getHealth() - 1);
        System.out.println(this.getName() + " kicks " + target.getName() + " in the name of " + this.getPantheon() + "!!!");
    }

    public void heal(Character target){
        target.setHealth(target.getHealth() + 2);
    }
}
