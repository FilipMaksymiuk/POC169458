public class D2 {

    public static void main(String[] args) {
        int n = 18;
        int wynik = znajdzPierwsza(n);
        System.out.println("najwieksza liczba piersza niejsza od "+ n+" to: " +wynik);
    }

    public static int znajdzPierwsza(int n){
        if(n>2){
        for (int i=n-1;i>1;i--) {
            if (pierwsza(i)){
                return i;
            }
        }
    }
        return 1;
    }

    public static boolean pierwsza(int prime){
        if(prime<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(prime);i++){
            if (prime %i==0){
                return false;
            }
        }
        return true;
    }
}
