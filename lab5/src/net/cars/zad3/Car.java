package net.cars.zad3;

public class Car {
    String brand;
    String model;
    int productionYear;

    public Car(){
        this.brand = "no brand";
        this.model = "no model";
        this.productionYear = 0;
    }
    public  Car(String brand,String model){
        this.brand = brand;
        this.model = model;
    }

    public  Car(String brand,String model, int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }
}


