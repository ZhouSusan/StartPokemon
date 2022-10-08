package org.example;

public class Squirtle extends Pokemon {

    private String gender;

    public Squirtle(String name,String type, String gender) {
        super(name, type);
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void speak() {
        System.out.print("Squirt Squirt Squirtle");
    }

    public void trainAbility() {
        System.out.println("\nYay. Torrent practice time. Shhhh wush!");
    }

    public void eat() {
        System.out.println("Pokey beans and Aprijuice please!");
    }

    @Override
    public void whoAmI() {
        System.out.println( "Her name is " + name + ". She is a cute " + gender + " turtle. She likes to shoot water and explore.");
    }
}
