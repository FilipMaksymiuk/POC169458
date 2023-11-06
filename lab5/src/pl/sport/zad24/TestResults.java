package pl.sport.zad24;

public class TestResults {
    public static void main(String[] args){
        Results results = new Results("Marek","Kochan",3);
        results.addResult(0,2);
        results.addResult(1,4);
        results.addResult(2,2);
        System.out.println(results.averageResult());
    }

}
