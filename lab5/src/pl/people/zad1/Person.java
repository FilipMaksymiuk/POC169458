package pl.people.zad1;

public class Person {
    String name;
    static int counter = 0;

    public Person(String name){
        this.name = name;
        counter++;
    }
     public static int counterValue(){
         return counter;
     }
}
