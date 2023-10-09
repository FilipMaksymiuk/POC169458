import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe!");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("Liczba jest parzysta!");
        }else{
            System.out.println("Liczba nie jest parzysta!");
        }
    }
}
