public class F13 {
    public static void main(String[] args) {
        int [] tab = {0,1,2,3,4,-5};
        System.out.println(minimumValue(tab));

    }
    public static int minimumValue(int []tab){
        int min = tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i]<min){
                min = tab[i];
            }
        }
        return min;
    }

}
