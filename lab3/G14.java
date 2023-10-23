import java.util.ArrayList;
import java.util.List;

public class G14 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.addAll(List.of(1,2,3));
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.addAll(List.of(4,5,6));

        ArrayList<Integer> lista3 = (ArrayList<Integer>) mergeArrays(lista1,lista2);
        for(int i=0;i<lista3.size();i++){
            System.out.print(lista3.get(i)+", ");
        }
    }
    public static List<Integer> mergeArrays(List<Integer> lista1, List<Integer> lista2){
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.addAll(lista1);
        lista3.addAll(lista2);
        return lista3;
    }
}
