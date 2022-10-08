package org.example;

public class Pokemon_Center {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle("Squirtle", "water", "female");
        squirtle.speak();
        squirtle.trainAbility();
        squirtle.eat();
        squirtle.whoAmI();

        Charmander charmander = new Charmander("Charmander", "fire", "water");
        charmander.speak();
        charmander.trainAbility();
        charmander.eat();
        charmander.whoAmI();

        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur", "Grass", 19.8);
        bulbasaur.speak();
        bulbasaur.trainAbility();
        bulbasaur.eat();
        bulbasaur.whoAmI();
    }
}