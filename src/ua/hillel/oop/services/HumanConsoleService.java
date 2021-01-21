package ua.hillel.oop.services;

import ua.hillel.oop.entities.Human;
import ua.hillel.oop.exception.AlreadyExistException;
import ua.hillel.oop.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class HumanConsoleService implements HumanService {
    private List<Human> humanList = new ArrayList<>();

    @Override
    public boolean isContainHuman(Human human) {
        return humanList.contains(human);
    }

    @Override
    public List<Human> getHumans() {
        return humanList;
    }

    @Override
    public void deleteFromList(int index) {
        humanList.remove(index);
    }

    @Override
    public void addToList(Human human) throws AlreadyExistException {
        if (!humanList.contains(human)) {
            humanList.add(human);
        } else {
            throw new AlreadyExistException("User " + human + " already exist");
        }
    }

    @Override
    public List<Human> findBySurname(String surname) throws NotFoundException {
        List<Human> humanListOfSameSurname = new ArrayList<>();
        for (Human human : humanList) {
            if (human.getSurname().equals(surname)) {
                humanListOfSameSurname.add(human);
            }
            if (humanListOfSameSurname.isEmpty()) {
                throw new NotFoundException("User with surname " + surname + " is not found");
            }
        }
        return humanListOfSameSurname;
    }

    @Override
    public List<Human> findByName(String name) throws NotFoundException {
        List<Human> humanListOfSameName = new ArrayList<>();
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
                humanListOfSameName.add(human);
            }
        }
        if (humanListOfSameName.isEmpty()) {
            throw new NotFoundException("User with name " + name + " is not found");
        }
        return humanListOfSameName;
    }
}
