public class D7 {

    public static void main(String[] args) {
        int a=1;
        int b=20;
        int c=3;
        int d=4;
        int wynik = metoda(a, b, c, d);
        System.out.println("Ile liczb,które dzielą sie przez "+ c +" i nie przez "+ d +" w przedziale(" + a + ", " + b + ")wynosi: "+ wynik);
    }

    public static int metoda(int a, int b, int c, int d) {
        int count = 0;
        for (int i =a+1;i<b;i++){
            if (i%c==0 && i%d!=0){
                count++;
            }
        }
        return count;
    }
}
