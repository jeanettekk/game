package com.qa;

public abstract class PlayableCharacter extends Character{

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;


    public PlayableCharacter(){
       super();
       this.setUserName("Unknown user");
    }

    public PlayableCharacter(int yPosition, int xPosition, int movement, int mana, int level, int health, String name){
        super( yPosition,  xPosition, movement,  mana,  level,  health,  name);
    }


    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void gainExperience(int experiencePoints){
        this.setExperiencePoints(getExperiencePoints() + experiencePoints);
    }

    public abstract void rest(boolean isLong);

    private int experiencePoints;



}
