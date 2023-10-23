import java.util.ArrayList;
import java.util.List;

public class G4 {
    public static void main(String[] args) {
        ArrayList<Double> lista1 = new ArrayList<>();
        lista1.addAll(List.of(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.5));
        System.out.println("Najmniejsza liczba w tablicy: "+minimumValue(lista1));


    }

    private static double minimumValue(ArrayList<Double> lista1) {
        double min = lista1.get(0);
        for(int i=0;i<lista1.size();i++){
            if(min>lista1.get(i)){
                min = lista1.get(i);
            }
        }
        return min;
    }
}
