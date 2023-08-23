package org.example;
public class MainClass1 {
        public static void main(String[] args) {


            OverloadedMethods calculator = new OverloadedMethods();

                System.out.println("Assignment was hard");

        System.out.println("Sum of two integers is: " + calculator.add(3, 10));

               System.out.println("Sum of three integers is: " + calculator.add(42, 10, 15));
            System.out.println("Sum of two doubles is: " + calculator.add(9.3, 32.7));
        }
    }


