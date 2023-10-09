import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby!");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>=b && a>=c){
            System.out.println("Najwieksza liczba to: "+a);
    }else if(b>=a && b>=c){
            System.out.println("Najwieksza liczba to: "+b);
        }else{
            System.out.println("Najwieksza liczba to: "+c);
        }



}
}
