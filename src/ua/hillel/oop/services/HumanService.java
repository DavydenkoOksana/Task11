package ua.hillel.oop.services;

import ua.hillel.oop.entities.Human;
import ua.hillel.oop.exception.AlreadyExistException;
import ua.hillel.oop.exception.NotFoundException;

import java.util.List;

public interface HumanService {
    boolean isContainHuman(Human human);
    List<Human> getHumans();
    void deleteFromList(int index);
    void addToList(Human human) throws AlreadyExistException;
    List<Human> findBySurname(String surname) throws NotFoundException;
    List<Human> findByName(String name) throws NotFoundException;
}
