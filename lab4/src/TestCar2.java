public class TestCar2 {
    static public void main(String[] args){
        /*
        Car2 myCar = null;
        System.out.println(myCar.brand);
        */
        Car2 myCar = null;
        if (myCar != null) {
            System.out.println(myCar.brand);
        } else {
            System.out.println("Obiekt Car jest null");
        }

    }

}
class Car2{
    public String brand;

}
/*
przypadku konfliktu nazw -to nazw klasy dodaj kolejną liczbę naturalną np. TestHouse2/House2.
tak wiec jest to drugie zadanie z klasa Car dokladniej 6
A. Stwórz klasę Car zawierającą publiczne pole brand. W klasie TestCar, utwórz obiekt
klasy Car, przypisz mu wartość null i spróbuj odwołać się do pola brand. Jaki jest
wynik?
Exception in thread "main" java.lang.NullPointerException: Cannot read field "brand" because "myCar" is null
at TestCar2.main(TestCar2.java:4)
spowoduje to wyjątek, ponieważ probuje uzyskac dostęp do zmiennej brand obiektu,ktory jeszcze nie został stworzony.

*/


//B. Zmodyfikuj kod z podpunktu A tak, aby sprawdzić, czy obiekt Car jest null przed
//odwołaniem się do pola brand. Jaki jest wynik?