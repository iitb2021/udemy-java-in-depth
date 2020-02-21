package com.iitb2021.basics.demo3;

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


        char charA ='A';
        System.out.println("charA: "+charA);
        char charInt= 65;
        System.out.println("charInt: "+charInt);
        char charUnicode1 = '\u0041';
        System.out.println("charUnicode1: "+charUnicode1);
        char charUnicode2 = 0x41;
        System.out.println("charUnicode2: "+charUnicode2);
        char charBinary = 0b01000001;
        System.out.println("charBinary: "+charBinary);
    }

    public static void main(String[] args) {
       primitives();
    }
}
