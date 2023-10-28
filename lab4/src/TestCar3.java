public class TestCar3 {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        String carBrand = cars[0].brand;

    }
}


class Car3{
    public String brand;

    public Car3(String brand){
        this.brand =brand;
    }
}

//Stwórz tablicę obiektów klasy Car (klasa zawiera publiczne pole brand). Następnie spróbuj odwołać się do pola brand jednego z obiektów w tablicy, nie inicjalizując wcześniej
//tablicy obiektami Car. Przeanalizuj wynik.
// spowoduje to wyjątek NullPointerException, ponieważ pomimo utworzenia tablic
//wszystkie jej elementy są = null(puste), dla cars[0].brand można uznać ,że to brak obiektu
//każdy element tablicy zawiera wartość domyślną dla typów referencyjnych, czyli null.