import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = input.nextDouble();
        System.out.println("Podaj b");
        double b = input.nextDouble();
        System.out.println("Podaj c");
        double c = input.nextDouble();
        System.out.println("Podaj x");
        double x = input.nextDouble();
        System.out.println("a+b-x^2= "+(a+b-x*x));
        System.out.println("(a-b)/(c-3)= "+((a-b)/(c-3)));
        System.out.println("3(4+5a)(b-c^3)= "+(3*(4+5*a)*(b-c*c*c)));

    }

}
