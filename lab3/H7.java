public class H7 {
    public static void main(String[] args) {
        String napis = "ala";
        takiesame(napis);

    }
    public static void takiesame(String napis){
        int ile = napis.length();
        if(ile==0){
            System.out.println("Pusty napis");
        }
        else if(napis.charAt(0)==napis.charAt(ile-1)){
            System.out.println("Zaczyna i konczy sie tym samym znakiem");
        }
        else {
            System.out.println("Nie zaczyna i konczy sie tym samym znakiem");
        }
    }
}
/*Używając metody charAt, napisz statyczną metodę, która sprawdza, czy dany napis
zaczyna się i kończy tym samym znakiem. Stwórz przypadek testowy.
*/