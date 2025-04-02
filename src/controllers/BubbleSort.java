package controllers;

import models.Person;

public class BubbleSort {

    public void sortByAge(Person[] people) {
        int tam = people.length;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {

                if (people[j].getAge() > people[j + 1].getAge()) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

    }

    public void sortByName(Person[] people) {
        int tam = people.length;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                int resultadoComparacion = people[j].getName().compareTo(people[j + 1].getName());
                if (resultadoComparacion > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

}
