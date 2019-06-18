package org.fasttrackit;

public class Adopter {

    private String name;
    private double acountMoney;

    public void feedAnimal(Animals animals, AnimalFood animalFood) {
        System.out.println( " Andrei just gave some " + animalFood.getName() + " food to " + animals.getName());
    }

    public void playWithPats(Animals animals, Activity activity) {
        System.out.println(" Andrei plays with " + animals.getName() + " with the " + activity.getName());
    }


    public Adopter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcountMoney() {
        return acountMoney;
    }

    public void setAcountMoney(double acountMoney) {
        this.acountMoney = acountMoney;
    }
}
