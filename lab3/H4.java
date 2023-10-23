
public class H4 {
    public static void main(String[] args) {
    String napis= "Marchew";
    String nowy = zamiana(napis);
    System.out.println(nowy);
    }
    public static String zamiana(String napis){
        int ile = napis.length();
        char pierwsza =napis.charAt(0);
        char ostatnia =napis.charAt(ile-1);


        String replaced =ostatnia +napis.substring(1,ile-1)+pierwsza;

        return replaced;
    }
}
/*Napisz statyczną metodę, która przyjmuje napis jako argument i zwraca ten napis z
zamienioną pierwszą i ostatnią literą. Stwórz przypadek testowy*/