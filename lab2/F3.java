import java.util.Scanner;

public class F3 {
    public static void main(String[] args) {

        int[] tab;
        tab = new int[15];
        Scanner input = new Scanner(System.in);
        int min=tab[0];
        int max=tab[0];
        for(int i=0;i<15;i++){
            System.out.println("Dodaj liczbe do tablicy!");
            int a = input.nextInt();
            tab[i] = a;
            if(tab[i]<=min){
                min = tab[i];
            }
            if(tab[i]>=max){
                max = tab[i];
            }
        }

        System.out.println("Najmniejsza liczba w tablicy to: "+min+" a największa: "+max);

    }

}
