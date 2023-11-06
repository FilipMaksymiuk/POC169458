package pl.people.zad1;

public class TestPerson {
    public static void main(String[] args){
        Person person = new Person("Marek");
        Person person1 = new Person("Michał");
        Person person2 = new Person("Maciej");

        System.out.println("Ilosć utworzonych instancji klasy Person: "+Person.counterValue());
    }
}
