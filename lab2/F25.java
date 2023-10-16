import java.util.Arrays;

public class F25 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int[] tab2 = {1, 2, 3, 4, 5};
        

        System.out.println("Tab=tab2? "+checkEquality(tab,tab2));
    }
    public static boolean checkEquality(int[] tab,int[] tab2 ){
        return Arrays.equals(tab, tab2);


    }
}

