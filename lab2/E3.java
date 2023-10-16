import java.util.Random;

public class E3 {
    public static void main(String[] args) {
        int a=5;
        int b =10;
        System.out.println(generateRandomIntInRange(a,b));
    }
    public static int generateRandomIntInRange(int a,int b){
        Random random = new Random();
        return random.nextInt(a,b);
    }
}
