package org.fasttrackit;

public class Dragon extends Animals {

   private int fireLevel;
   private int wings;

    @Override
    public void animalSpirit(String mood) {
        super.animalSpirit(mood);
        System.out.println(getName() + "is feels" + mood);
    }



    public Dragon(String name, int age) {
        super(name, age);
    }

    public Dragon(String name) {
        super(name);
    }

    public int getFireLevel() {
        return fireLevel;
    }

    public void setFireLevel(int fireLevel) {
        this.fireLevel = fireLevel;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
