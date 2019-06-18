package org.fasttrackit;

public class Hedgehog extends Animals {

   private int Spike;

    public Hedgehog(int age) {
        super(age);
    }

    public Hedgehog(String name, int age) {
        super(name, age);
    }

    public Hedgehog(String name) {
        super(name);
    }


    public int getSpike() {
        return Spike;
    }

    public void setSpike(int spike) {
        Spike = spike;
    }
}
