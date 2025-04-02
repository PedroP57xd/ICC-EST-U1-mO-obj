import models.Person;
import controllers.MangePeople;

public class App {
    public static void main(String[] args) throws Exception {
        // Person person = new Person("Pedro",18);
        // System.out.println(person.getName());

        MangePeople mG = new MangePeople();
        mG.sortPeopleByAge();
    }
}
