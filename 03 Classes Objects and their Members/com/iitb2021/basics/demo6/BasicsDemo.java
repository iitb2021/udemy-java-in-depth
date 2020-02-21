package com.iitb2021.basics.demo6;

public class BasicsDemo {


    static void threeDimensionalArrays(){
        System.out.println("\nInside threeDimensionalArrays");
         int [][][] unitSold = new int [] [] [] {
                 // New York
                 {
                         {0 , 0, 0 , 0},    // January [ iphone, iPad, Laptop, TV]
                         {0 , 0, 0 , 0},    // February
                         {0 , 0, 0 , 0},    // March
                         {0 , 850, 0 , 0}     // April
                 },

                 // San Francisco
                 {
                         {0 , 0, 0 , 0},    // January [ iphone, iPad, Laptop, TV]
                         {0 , 0, 0 , 0},    // February
                         {0 , 0, 0 , 0},    // March
                         {0 , 0, 0 , 0}     // April
                 },

                 // Chicago
                 {
                         {0 , 0, 0 , 0},    // January [ iphone, iPad, Laptop, TV]
                         {0 , 0, 0 , 0},    // February
                         {0 , 0, 0 , 0},    // March
                         {0 , 0, 0 , 0}     // April
                 },

                 // Atlanta
                 {
                         {0, 0, 0, 0},    // January [ iphone, iPad, Laptop, TV]
                         {0, 0, 0, 0},    // February
                         {0, 0, 0, 0},    // March
                         {0, 0, 0, 0}     // April
                 }
         };

        System.out.println("unitSold [0] [3] [1] : "+ unitSold [0] [3] [1]);
    }

    public static void main(String[] args) {
        threeDimensionalArrays();
    }
}
