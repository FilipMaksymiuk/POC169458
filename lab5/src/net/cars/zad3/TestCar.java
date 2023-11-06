package net.cars.zad3;

public class TestCar {
    public static void main(String[] args){

        Car car = new Car();
        Car car2 = new Car("BMW","E36");
        Car car3 = new Car("Audi","A4",2005);

        System.out.println("Dla pierwszego kontruktora: brand: "+ car.brand +", model: "+ car.model +", rok produkcji: "+ car.productionYear);
        System.out.println("Dla drugiego kontruktora: brand: "+ car2.brand +", model: "+ car2.model +", rok produkcji: "+ car2.productionYear);
        System.out.println("Dla trzeciego kontruktora: brand: "+ car3.brand +", model: "+ car3.model +", rok produkcji: "+ car3.productionYear);

    }
}
