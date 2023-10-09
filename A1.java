import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe!");
        int a = input.nextInt();

        System.out.println("Podaj 2 liczbe!");
        int b = input.nextInt();

        System.out.println("Podaj jaka operacje mam wykonac!\n1.Dodawanie!\n2.Odejmowanie!\n3.Mnozenie!\n4.Dzielenie! ");
        int opcja = input.nextInt();

        if (opcja==1){
            System.out.println(a+b);
        }else if (opcja==2){
            System.out.println(a-b);
        }else if (opcja==3){
            System.out.println(a*b);
        }else if (opcja==4){
            if(b==0){
                System.out.println("Nie dziel przez zero!");
            }else{
                System.out.println(a/b);
            }

        }else {
            System.out.println("Bledne dane!");
        }
    }
}

