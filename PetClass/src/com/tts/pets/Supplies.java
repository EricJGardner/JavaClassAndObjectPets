package com.tts.pets;
import java.util.Scanner;
//class with three private instance variables
public class Supplies {
        private String toy;
        private int bagsOfFood;
        private String litter;

//empty constructor
        public Supplies(){
            String toy = "";
            int bagsOfFood = 0;
            String litter = "";

        }

//constructor that uses all 3 variables
        public Supplies(String toy, int bagsOfFood, String litter) {
            this.toy = toy;
            this.bagsOfFood = bagsOfFood;
            this.litter = litter;
        }

//constructor that only uses 2 variables
        public Supplies( int bagsOfFood, String litter){
                this.bagsOfFood = bagsOfFood;
                this.litter = litter;
            }

//method that returns a Boolean
        public boolean goToStore(){
            Scanner scan = new Scanner(System.in);
            System.out.println("How many bags of cat food do you have?");
            System.out.println("Please enter a numeric value:");
            int x = scan.nextInt();
            if (x>1 && x<5) {
                System.out.println("No need for the store today, but...");
                return true;
           }else if (x==0 || x==1){
                System.out.println("Go to the store!");
                return false;
            }else{
                System.out.println("Really? That is a crazy amount of food, but...");
                return false;
            }
        }

//method that returns a string
        public void reminder(){
            System.out.println("Don't forget- it is always nice to pick up some treats!");
        }

//getters and setters
            public String getToy () {
                return toy;
            }

            public void setToy (String toy){
                this.toy = toy;
            }

            public int getBagsOfFood () {
                return bagsOfFood;
            }

            public void setBagsOfFood ( int bagsOfFood){
                this.bagsOfFood = bagsOfFood;
            }

            public String getLitter () {
                return litter;
            }

            public void setLitter (String litter){
                this.litter = litter;
            }
//toString method to test output

    @Override
    public String toString() {
        return "Supplies{" +
                "toy='" + toy + '\'' +
                ", bagsOfFood=" + bagsOfFood +
                ", litter='" + litter + '\'' +
                '}';
    }
}