package ua.hillel.oop.entities;


import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String patronymic;

    public Human(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + patronymic;
    }
}
