package pl.sport.zad24;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;


    public Results(String firstName,String lastName, int tabSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[tabSize];

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int[] getResults(){
        return results;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setResults(int[] newResults){
        this.results = newResults;
    }

    public void addResult(int index,int result){
        if(index>=0 && index<results.length){
            results[index] =result;
        } else{
            System.out.println("Błednie wprowadzone indeksy");
        }
    }

    public double averageResult(){
        if(results.length==0){
            return 0;
        }

        double wynik = 0.0;
        for(int i=0;i<results.length;i++){
            wynik += results[i];
        }
        return wynik /results.length;
    }


}
