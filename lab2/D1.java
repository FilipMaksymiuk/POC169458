public class D1 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Suma szeregu ="+ metoda(n));
 }

    public static int metoda(int n){
        int suma =0;
        for(int i=0;i<=n;i++){
            if(i%2==1){
                suma +=i;
               // System.out.println(i);
            }
            else{
                suma-=i;
               // System.out.println(i);
            }
        }
        return suma;
    }
}
