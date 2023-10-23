public class H19 {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("cukiereczki");
        char c='c';
        int liczbaWystapien =countOccurrences(sb,c);
        System.out.println("Wystąpienie znaku "+c+" w wyrazie: "+sb+" wynosi: " +liczbaWystapien+" razy");
    }
    public static int countOccurrences(StringBuffer sb,char c){
        int ile =0;
        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i) == c){
                ile++;
            }
        }
        return ile;
    }
}
