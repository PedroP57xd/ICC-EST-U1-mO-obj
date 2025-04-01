package models;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Clase persona creada");
    }

    public Person(String name, int edad) {
        this.name = name;
        this.age = edad;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
