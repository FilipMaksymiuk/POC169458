package pl.instance.zad3;

public class TestSingleton {
    public static void main(String[] args){

        Singleton instance1 =Singleton.getInstance();
        Singleton instance2 =Singleton.getInstance();

        if(instance1==instance2){
            System.out.println("Ta sama instancja Singleton");
        }
        else{
            System.out.println("Różne instancje Singleton");
        }
    }
}
