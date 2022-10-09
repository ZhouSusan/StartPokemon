package org.example;
import java.util.ArrayList;

public class Pokemon_Center {
    public static void main(String[] args) {
        ArrayList <Pokemon> pokeyTeam = new ArrayList <>();
        Squirtle squirtle = new Squirtle("Squirtle", "water", "female");
        Charmander charmander = new Charmander("Charmander", "fire", "water");
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur", "Grass", 19.8);

        pokeyTeam.add(charmander);
        pokeyTeam.add(squirtle);
        pokeyTeam.add(bulbasaur);

        
    }
}