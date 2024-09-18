package com.qa;

public abstract class NPC extends Character {


    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    private String greeting;

    public NPC(){
        super();
        this.setGreeting("OOOOH! GREETINGS WEARY TRAVELLER!");

    }

    public NPC(String name, String greeting){
        super();
        this.setGreeting(greeting);
        this.setName(name);
    }
}
