import java.util.ArrayList;
import java.util.List;

public class G3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.addAll(List.of(1,2,3,4,5,6,7,8));
        System.out.println("Najmniejsza liczba w tablicy: "+minimumValue(lista1));


}

    private static int minimumValue(ArrayList<Integer> lista1) {
        int min = lista1.get(0);
        for(int i=0;i<lista1.size();i++){
            if(min>lista1.get(i)){
                min = lista1.get(i);
            }
        }
        return min;
    }
}
