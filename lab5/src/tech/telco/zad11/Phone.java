package tech.telco.zad11;

public class Phone {
    String manufacturer;
    String model;
    String operatingSystem = "Android";

    public Phone(String manufacturer, String model){

        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = "iOS";
    }

}
