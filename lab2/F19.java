public class F19 {
    public static void main(String[] args) {
        int []tab={1,22,3,0,-5};
        int []tab2=copyArray(tab);
        for(int i=0;i<tab.length;i++){
            System.out.print(tab2[i]+", ");
        }

    }
    public static int[] copyArray(int []tab){
        int []kopia;
        int rozmiar = tab.length;
        kopia = new int[rozmiar];
        for(int i=0;i<rozmiar;i++){
            kopia[i]=tab[i];
        }
         return kopia;
    }
}
