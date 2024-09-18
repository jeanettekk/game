package com.qa;

public class Dragon extends NPC implements Flying{
    public String getLair() {
        return lair;
    }

    public void setLair(String lair) {
        this.lair = lair;
    }

    private String lair;

    public Dragon(){
        this("Smaug", "DIE INSECTS!", "Volcano");
    }

    public Dragon(String name, String greeting, String lair){
        super();
        this.setName(name);
        this.setGreeting(greeting);
        this.setLair(lair);
    }

    public void stealPrincess(){
        System.out.println("Dragon stole a princess! Oh no!");
    }

    public void fireAttack(Character[] targets){
        System.out.println("Dragon breathes fire!");
        for(Character c : targets){
            doDamage(c);
        }

    }

    @Override
    public void doDamage(Character target) {
        target.setHealth(target.getHealth() - 7);
        System.out.println("Dragon burns " + target.getName());
    }


    @Override
    public void takeOff() {
        this.setMovement(this.getMovement() + 5);
        System.out.println(this.getName() + " roars!");
    }

    @Override
    public void land() {
        this.setMovement(this.getMovement() - 5);
        System.out.println(this.getName() + " dives into the ground! Watch out!");
    }
}
