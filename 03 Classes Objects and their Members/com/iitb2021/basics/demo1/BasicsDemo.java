package com.iitb2021.basics.demo1;

public class BasicsDemo {


    static void print(){
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!");           // Advance cursor to the beginning of the next line
        System.out.println();                           // Print empty line
        System.out.print("Hello, World!!");             // Cursor stayed after the printed string
        System.out.println("Hello,");                   // Print a space
        System.out.print(" ");
        System.out.println("world!!");

    }

    public static void main(String[] args) {
       print();
    }
}
