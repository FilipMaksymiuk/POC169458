public class F8 {
    public static void main(String[] args) {
        double[] tab = {1.0, 2.0, 3.5, 4.35, 0.0, 0.004, 0.005, 0.0002, 0.05, 0.05};
        double suma =0.0;
        for(int i=0;i<10;i++){
            if(tab[i]>0.5){
                suma += tab[i];
            }
        }
        System.out.println(suma);
    }
}
