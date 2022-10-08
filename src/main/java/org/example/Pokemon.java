package org.example;

abstract class Pokemon {

    public String name;
    public String type;

    public Pokemon() {
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract void speak();

    abstract void trainAbility();

    public void eat() {
        System.out.println("I eat fruits");
    }

    public void whoAmI() {
        System.out.println("His name is " + name + ". He is a " + type + " type.");
    }
}
