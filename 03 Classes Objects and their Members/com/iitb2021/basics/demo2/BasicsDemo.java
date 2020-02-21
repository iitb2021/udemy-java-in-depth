package com.iitb2021.basics.demo2;

public class BasicsDemo {


    static  void primitives(){
        System.out.println("\n\nInside primitives ...");
        // literals demo

        int intHex = 0x0041;
        System.out.println("intHex: "+intHex);
        int intBinary = 0b01000001;
        System.out.println("intBinary: "+intBinary);
        int intUndrdcore = 1_2_456;
        System.out.println("intUndrdcore: "+intUndrdcore);
    }

    public static void main(String[] args) {
       primitives();
    }
}
