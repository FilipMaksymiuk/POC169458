public class TestDog {

        public static void main(String[] args){

            Dog myDog = new Dog("Floksiu","wielorasowiec", 7);
            System.out.println("Name: "+myDog.getName());
            System.out.println("Breed: "+myDog.getBreed());
            System.out.println("Age: "+myDog.getAge());
            myDog.bark();
        }


}
class Dog{
     String name;
     String breed;
     int age;


    public Dog(String name, String breed, int age){
        this.name =name;
        this.breed=breed;
        this.age =age;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public void bark(){
        System.out.println("Wow, Wow");
    }
}
