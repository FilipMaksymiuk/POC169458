import java.util.ArrayList;
import java.util.List;

public class G6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.addAll(List.of(1,2,3,4,5));

        ArrayList<Integer> lista2 = (ArrayList<Integer>) reverseArray(lista1);
        for(int i=0;i<lista1.size();i++){
            System.out.print(lista2.get(i)+", ");
        }

    }
    private static ArrayList<Integer> reverseArray(ArrayList<Integer> lista1) {
        ArrayList<Integer> lista2 = new ArrayList<>();
        for(int i=lista1.size()-1;i>=0;i--){
            lista2.add(lista1.get(i));
        }
        return lista2;
    }
}
