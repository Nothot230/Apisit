package Exercise;

public class TestPerson {
    public static void main(String[] args){
        Person person = new Person("Rus", "Tic","male", 21);
        System.out.println(person);
        Person person2 = new Person("Anna Lee", "Tic");
        System.out.println(person2);
        Person person3 = new Person("Anna Lee", "Tic","n/a", -1);
        System.out.println(person3);
    }
}
