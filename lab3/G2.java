import java.util.ArrayList;

public class G2 {
    public static void main(String[] args) {
        double suma =0.0;
        ArrayList<Double> listaDouble = new ArrayList<>();
        listaDouble.add(1.0);
        listaDouble.add(2.0);
        listaDouble.add(3.0);
        listaDouble.add(4.0);
        listaDouble.add(5.0);
        listaDouble.add(6.0);
        listaDouble.add(7.0);
        listaDouble.add(8.0);
        listaDouble.add(9.0);
        listaDouble.add(10.3);
        for(int i=0;i<listaDouble.size();i++){
            suma += listaDouble.get(i);
        }
        System.out.println(suma);
    }
}