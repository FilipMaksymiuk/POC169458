public class D9 {
    public static void main(String[] args) {
        int n=14;
        int k=3;
    System.out.println(newton(n,k));
    }
    public static long silnia(int liczba){
        long wynik = 1;
    for(int i=1;i<=liczba;i++){
        wynik *= i;
    }
    return wynik;
    }
    public static long newton(int n,int k){
        int temp =n-k;
        long odpowiedz = silnia(n)/(silnia(k)*(silnia(temp)));
    return odpowiedz;
}
}
