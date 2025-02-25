package org.example.restservice;

public class Person {
    private PersonStatus personStatus;
    private int id;
    private String firstName;
    private int age;
    private String eduLevel;

    public Person() {

    }

//    public Person(int id, String firstName, int age) {
//        this.id = id;
//        this.firstName = firstName;
//        this.age = age;
//    }

    public Person(int id, String firstName, int age, String eduLevel) {
        this.personStatus = PersonStatus.ACTIVE;
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.eduLevel = eduLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonStatus getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(PersonStatus personStatus) {
        this.personStatus = personStatus;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }
}
