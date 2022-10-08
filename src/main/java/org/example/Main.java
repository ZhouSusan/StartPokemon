package org.example;

public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle("Squirtle", "water", "female");
        squirtle.speak();
        squirtle.trainAbility();
        squirtle.eat();
        squirtle.whoAmI();
    }
}