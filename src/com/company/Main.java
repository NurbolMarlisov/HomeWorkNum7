package com.company;

public class Main {

    public static void main(String[] args) {


        // public static Hero[] allHeroes;
        //Magic hero1 = new Magic();
        // Medic hero2 = new Medic();
        //Warrior hero3 = new Warrior();
        // Hero[] heroes = {hero1,hero2,hero3};
        //Hero heroes = new Hero();
        HavingSuperAbility heroes = new Magic();
        HavingSuperAbility[] heroes1 = {heroes, new Medic(), new Warrior()};
        for (int i = 0; i < heroes1.length ; i++) {
            heroes1[i].applySuperAbility();

        }



    }
}
