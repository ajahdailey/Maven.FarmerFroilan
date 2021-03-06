package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.Edible;

import com.zipcodewilmington.froilansfarm.Crop.Egg;
import com.zipcodewilmington.froilansfarm.Crop.Produce;

public class Chicken extends Animal implements Produce {
    boolean hasBeenFertilized;

    private Chicken() {
        this.hasBeenFertilized = false;
    }

    public static Chicken createChicken() {
        return new Chicken();
    }


    public void eat(Edible food) {
        food = null;
        System.out.println("OM NOM NOM");
    }

    public void makeNoise() {
        System.out.println("Cluck!");
    }

    public Egg yield() {

        return new Egg();
    }

    public void fertilize(){
        hasBeenFertilized = true;
    }

    @Override
    public void sleep() {

    }
}
