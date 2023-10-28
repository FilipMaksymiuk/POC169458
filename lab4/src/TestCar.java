public class TestCar {
    public static void main(String[] args){
        Car myCar = new Car("BMW", "e36", 180);
        System.out.println("Marka auta: "+myCar.getBrand()+" Model: "+myCar.getModel()+" Prędkość: "+myCar.getSpeed());
        myCar.accelerate(10);
        System.out.println("Predkosc po wzroście: "+myCar.getSpeed());
        myCar.decelerate(60);
        System.out.println("Predkosc po obniżeniu: "+myCar.getSpeed());
    }
}
class Car{
    String brand;
    String model;
    int speed;
    public Car(String brand,String model, int speed){
        this.brand=brand;
        this.model=model;
        this.speed=speed;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getSpeed(){
        return speed;
    }
    public void accelerate(int value){
        speed +=value;
    }
    public void decelerate(int value){
        speed -=value;
    }
}

