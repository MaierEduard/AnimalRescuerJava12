package org.fasttrackit;


import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {


        Animals firstAnimal = new Animals("Tryndamere", 6);
        firstAnimal.setAge(5);
        firstAnimal.name = "Tryndamere";
        firstAnimal.setFavoriteActivity("playing with swords");
        firstAnimal.setFavoriteFood("Anivia Eggs");
        firstAnimal.setHungerLevel(10);
        firstAnimal.setSpiritLevel(1);
        firstAnimal.setHealthLevel(9);


        Adopter firstAdopter = new Adopter("Atrox");
        firstAdopter.setAcountMoney(130.50);
        LocalDate localDate = LocalDate.of(2020, Month.FEBRUARY, 20);
        AnimalFood food = new AnimalFood("chiken", 20.50, false);
        AnimalFood food2 = new AnimalFood(localDate);
        // food.name = "chiken";
        food.setQuantity(23);
        food.setPrice(35);
        //food.availability = true;
        System.out.println(localDate);
        System.out.println(food2.getExpirationDate());


        Animals secondAnimal = new Animals(6);
        Animals hedgehog = new Hedgehog("Adolf");

        Adopter secondAdopter = new Adopter("Andrei");
        secondAdopter.feedAnimal(new Animals("Tryndamere"), new AnimalFood("Chiken"));
        secondAdopter.playWithPats(new Animals("Adolf"), new Activity("ball"));



        firstAnimal.numbersForSum(1, 4);

    }

}
