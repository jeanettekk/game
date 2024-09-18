package com.qa;

public interface Flying {

    default void fall(Character c){
        System.out.println(c.getName() + " falls from the sky and dies.");
        c.setHealth(0);
    }
    void takeOff();


    void land();
}
