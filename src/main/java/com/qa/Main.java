package com.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Healer megan = new Healer("Megan", "The Seven");
        Caster johnny = new Caster("Johnny", "Arcane");
        Caster lisa = new Caster("Lisa", "Dark");

        Caster skeletor = new Caster("Skeletor", "Necromancy");

        Dragon smaug = new Dragon();

        System.out.println(megan);

        System.out.println(megan.rollDice());

        Character[] heroes = {megan, johnny, lisa};

        Flying[] flyers = {smaug, johnny, lisa};

        for(Character c : heroes){
            c.doDamage(skeletor);
        }

        for(Flying f : flyers){
            f.takeOff();

        }

        List<Flying> flyingList = new ArrayList<>();

        Collections.addAll(flyingList, flyers);

        for(int i = 0; i < flyingList.size(); i++){
            Flying flyer = flyingList.get(i);
            if(flyer instanceof Character){
                flyer.fall((Character) flyer);
            }
        }



    }
}