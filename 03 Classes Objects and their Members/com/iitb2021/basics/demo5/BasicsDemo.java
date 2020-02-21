package com.iitb2021.basics.demo5;

public class BasicsDemo {


    static void arrays(){
        System.out.println("\nInside Arrays");
        int [] myArray = new int [] {9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length: "+myArray.length);
        System.out.println("myArray [1] : "+myArray [1]);
        System.out.println("myArray [7] : "+myArray [7]); // Throws ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        arrays();
    }
}
