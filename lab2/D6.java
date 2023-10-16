public class D6 {
    public static void main(String[] args) {
        int n = 3;

    System.out.println("wynik to:"+potega7(n));
    }
    public static double potega7(int n){
        double wynik = 1.0;
        for(int i=1;i<=n;i++){
            wynik *= 7;
        }
        return 1.0/wynik;
    }
}
