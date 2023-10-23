import java.util.ArrayList;
import java.util.List;

public class G5 {
    public static void main(String[] args) {
        ArrayList<Double> listaDouble = new ArrayList<>();
        listaDouble.add(1.5);
        listaDouble.add(2.5);
        listaDouble.add(2.0);
        System.out.println(average(listaDouble));
    }

    public static double average(List<Double> lista){
        double suma =0.0;
        int ile = lista.size();
        if(ile>0){
            for(int i=0;i<ile;i++){
                suma += lista.get(i);
            }
            suma /=ile;
            return suma;
        }

        return  0;
    }
}
