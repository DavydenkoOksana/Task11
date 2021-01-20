package ua.hillel.oop.services;

import ua.hillel.oop.entities.Human;

import java.util.List;

public interface HumanService {
    boolean isContainHuman(Human human);
    List<Human> getHumans();
    void deleteFromList(int index);
    void addToList(Human human);
    List<Human> findBySurname(String surname);
    List<Human> findByName(String name);
}
