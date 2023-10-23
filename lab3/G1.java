import java.util.ArrayList;


public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        for(int i=0;i<=10;i++){
            lista1.add(i);
        }
        int ile= lista1.size();
        for(int i=ile-1;i>=0;i--){
            System.out.print(lista1.get(i)+", ");
        }




    }

}
