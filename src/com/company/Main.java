package com.company;
import java.util.Scanner;
        public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double pizzaPrice = 0;
                int placeholder = 0;
                String topping;
                System.out.println("What size would you like? 1 = Small, 2 = Medium, 3 = Large");
                int pizzaSize = input.nextInt();
                System.out.println("");
                if (pizzaSize == 1){

                    pizzaPrice = 7.99;

            if (pizzaSize==2){

                pizzaPrice = 10.99;

                }

            if (pizzaSize==3){

                pizzaPrice = 13.99;
            }



            }
        }

    }

