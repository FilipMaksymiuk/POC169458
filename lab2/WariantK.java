import java.util.Scanner;

public class WariantK {
    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby calkowite!");
        Scanner input = new Scanner(System.in);
        System.out.println("Początek zakresu!");
        int a = input.nextInt();
        System.out.println("Koniec zakresu!");
        int b = input.nextInt();
        System.out.println("Liczby parzyste w zakresie:"+a+"-"+ b);
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }





    }
}