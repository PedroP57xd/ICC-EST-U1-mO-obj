package controllers;

import models.Person;
import views.ViewConsole;

public class MangePeople {
    private ViewConsole vista;
    private BubbleSort sorting;
    private Person[] people;

    public MangePeople() {
        // Instanciar clases
        this.vista = new ViewConsole();
        this.sorting = new BubbleSort();
        // Instanciar variables
        this.people = new Person[5];
        this.people[0] = new Person("Alice", 30);
        this.people[1] = new Person("Bob", 25);
        this.people[2] = new Person("Charlie", 35);
        this.people[3] = new Person("David", 20);
        this.people[4] = new Person("Eve", 28);

        vista.showessage("clase ManagePeople CRETATE");
        vista.printPeopleList(people);

    }

    public void sortPeopleByAge() {
        vista.showessage("Personas por edad");
        sorting.sortByAge(people);
        vista.printPeopleList(people);
    }

    public void sortPeopleByName() {
        vista.showessage("Personas por Nombre");
        sorting.sortByName(people);
        vista.printPeopleList(people);
    }

}
