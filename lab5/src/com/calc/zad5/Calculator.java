package com.calc.zad5;

public class Calculator{
    public static void dodawanie(int a,int b){
        System.out.println(a+b);
    }

    public static void odejmowanie(int a,int b){
        System.out.println(a-b);

    }

    public static void mnozenie(int a,int b){
        System.out.println(a*b);
    }

    public static void dzielenie(double a,double b){
        if (b!=0){
            System.out.println(a/b);
        } else{
           System.out.println("Dzielenie przez zero!");

        }
    }
}
