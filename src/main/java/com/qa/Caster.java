package com.qa;

public class Caster extends PlayableCharacter implements Flying{

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }

    private String magicType;


    public Caster(){
        super();
        this.setMagicType("Unknown Magic");
    }

    public Caster(int yPosition, int xPosition, int movement, int mana, int level, int health, String name, String magicType) {
        super(yPosition, xPosition, movement, mana, level, health, name);
        this.setMagicType(magicType);
    }

    public Caster(String name, String magicType) {
        super();
        this.setMagicType(magicType);
        this.setName(name);
    }

    @Override
    public void rest(boolean isLong) {
        if(isLong){
            this.setMana(100);
            this.setHealth(10);
        } else {
            this.setMana(50);
            this.setHealth(this.getHealth() + 2);
        }
    }

    @Override
    public void doDamage(Character target) {
        target.setHealth(target.getHealth() - 5);
        System.out.println(this.getName() + " casts a terrifying " + this.getMagicType() + " spell onto " + target.getName() + "!!!");
    }

    public void teleport(int xTarget, int yTarget){
        if(this.getMana() >= 10){
            this.setPosition(xTarget, yTarget);
            this.setMana(this.getMana() - 10);
        } else {
            System.out.println("NOT ENOUGH MANA! GO REST!");
        }

    }


    @Override
    public void takeOff() {
        this.setMovement(this.getMovement() + 2);
        this.setMana(this.getMana() - 10);
        System.out.println(this.getName() + " hovers in the air on a cloud of magic.");
    }

    @Override
    public void land() {
        this.setMovement(this.getMovement() - 2);
        System.out.println("The cloud gently puts " + this.getName() + " back on the ground.");
    }
}
