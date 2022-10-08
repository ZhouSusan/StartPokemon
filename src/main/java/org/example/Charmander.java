package org.example;

public class Charmander extends Pokemon {

    public String weakness;

    public Charmander(String name, String type) {
        super(name, type);
    }

    public Charmander (String name, String type, String weakness) {
        super(name, type);
        this.weakness = weakness;
    }

    public void speak() {
        System.out.println("Char Charm Charmander");
    }

    public void trainAbility() {
        System.out.println("Check out his Blaze attack, pow");
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.println("His weakness  is to " + weakness + ", but he loves warm hugs.");
    }

    public void eat() {
        System.out.println("He only eats Pokey snacks and popcorn!");
    }
}
