public class TestCat {
    static public void main(String[] args){
        Cat myCat = new Cat();
        System.out.println(myCat.name);
        Cat newCat = myCat.createCat("Rydzyk");
        if(newCat !=null){
            System.out.println(newCat.getName());
        }
    }
}
class Cat {
    String name;
    public Cat(){
        this.name=null;
    }
    public Cat createCat(String value) {
        if (value!=null) {
            Cat newCat = new Cat();
            newCat.setName(value);
            return newCat;
        }else{
            System.out.println("Podana wartosc to null.");
            return null;
        }
    }
    public void setName(String value){
        this.name=value;
    }
    public String getName(){
        return this.name;
    }
}

/*
Stwórz klasę Cat z polem name. Dodaj do klasy Cat metodę createCat, która zwraca
nowy obiekt klasy Cat. Metoda powinna ustawiać pole name na podaną wartość, ale
tylko jeśli wartość nie jest null. W przeciwnym razie powinna zwracać null. W klasie
TestCat użyj metody createCat do stworzenia obiektu cat, a następnie spróbuj wydrukować wartość pola name. Co się stanie, jeśli przekażesz null jako argument do metody
createCat? Przeanalizuj wynik.
*/
