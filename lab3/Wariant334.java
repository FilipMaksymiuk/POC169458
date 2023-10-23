public class Wariant334 {
    public static void main(String[] args) {
        int n = 666;
        System.out.println(czyPodzielnaPrzezTrzy(n));
    }
    public static boolean czyPodzielnaPrzezTrzy(int n){
        if(n%3==0){
            return true;
        }
        return false;
    }
}
