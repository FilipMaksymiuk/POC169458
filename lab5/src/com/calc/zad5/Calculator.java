package com.calc.zad5;

public class Calculator{
    public static int dodawanie(int a,int b){
        return a+b;
    }

    public static int odejmowanie(int a,int b){
        return a-b;
    }

    public static int mnozenie(int a,int b){
        return a*b;
    }

    public static double dzielenie(double a,double b){
        if (b!=0){
            return a/b;
        } else{
           System.out.println("Dzielenie przez zero!");
           return 0;
        }
    }
}
/*
  Utwórz drugą klasę, w
  której przetestujesz te metody bez tworzenia instancji
klasy Calculator.*/