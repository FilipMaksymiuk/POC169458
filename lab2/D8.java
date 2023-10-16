public class D8 {
    public static void main(String[] args) {
        int n =4;
        int dwan =(n*2);
        System.out.println("Suma liczb calkotiych od "+n+" do "+dwan+" wynosi:"+sumaLiczbCalkowitych(n));
    }
    public static int sumaLiczbCalkowitych(int n){
        int suma =0;
        for(int i=n;i<=2*n;i++){
            suma += i;

        }
        return suma;
    }

}
