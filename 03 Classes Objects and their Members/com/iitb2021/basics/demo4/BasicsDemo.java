package com.iitb2021.basics.demo4;

public class BasicsDemo {


    static void typeCasting(){

        // Explicit casting
        long y = 42;
        //int x = y ;
        int x = (int) y;

        // Information loss due to out of range assignment
        byte narrowByte = (byte) 123456;
        System.out.println("narrowByte:" +narrowByte);

        // Truncation
        int iTruncared = (int) 0.99;
        System.out.println("iTruncared:" +iTruncared);

        // Implicit cast
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt:" +iInt);

        // Byte to char using implicit cast
        byte bByte = 65;
        cChar = (char) bByte;     // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar:" +cChar);

    }

    public static void main(String[] args) {
        typeCasting();
    }
}
