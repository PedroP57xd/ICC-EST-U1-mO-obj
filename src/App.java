import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Pedro",18);
        System.out.println(person.getName());
    }
}
