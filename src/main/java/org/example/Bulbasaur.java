package org.example;

public class Bulbasaur extends Pokemon {

    private double weight;

    public Bulbasaur(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void speak() {
        System.out.println("Bul Bulb Bulbasaur");
    }

    public void eat() {
        System.out.println("Hmmm... cupcakes, acorns and bananas");
    }

    public void trainAbility() {
        System.out.println("He uses Overgown. Watch his speedy grass moves.");
    }


    public void whoAmI() {
        super.whoAmI();
        System.out.println("He is pretty light-weight " + weight + " lbs for his age.");
    }
}