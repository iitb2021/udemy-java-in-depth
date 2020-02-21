package com.iitb2021.basics.demo9;

public class BasicsDemo {

    static void varargsOverload(boolean b, int i, int j, int k){
        System.out.println("\nInside vargasOverload without varargs");
    }

    static void varargsOverload(boolean b, int... list){
        System.out.println("\nInside vargasOverload with varargs");
        System.out.println("list.length: "+list.length);
    }
    public static void main(String[] args) {
        varargsOverload(true,1,2,3);
        varargsOverload(true,1,2,3,4);
        varargsOverload(true);

    }
}
