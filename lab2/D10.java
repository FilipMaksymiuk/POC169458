public class D10 {
    public static void main(String[] args) {
    int n=1121;
    System.out.println("1 same jedynki/0 nie same jedynki: "+metoda(n));
    }
    public static boolean metoda(int n){
        String liczba = n + "";
        int i=0;

        while (i < liczba.length()) {
            char znak = liczba.charAt(i);
            if(znak!='1'){
                return false;
            }
            i++;

        }
        return true;
    }
}
