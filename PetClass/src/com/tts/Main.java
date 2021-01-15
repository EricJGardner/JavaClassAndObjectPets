package com.tts;


import com.tts.pets.Pet;
import com.tts.pets.Supplies;

public class Main {

    public static void main(String[] args) {
    //calling Pet class methods
    Pet myPet = new Pet();
	myPet.setName("Winston");
	myPet.setAge(1);
	myPet.setLocation("My lap");
	myPet.setType("Demonspawn");
        System.out.println(myPet);

//calling Supplies class methods
    Supplies needSupplies = new Supplies();
    needSupplies.setToy("Fake Mouse");
    needSupplies.setBagsOfFood(1);
    needSupplies.setLitter("Tidy Cats");
		System.out.println(needSupplies);
	needSupplies.goToStore();
	needSupplies.reminder();




    }
}
