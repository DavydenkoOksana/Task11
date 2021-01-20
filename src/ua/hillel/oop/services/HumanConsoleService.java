package ua.hillel.oop.services;

import ua.hillel.oop.entities.Human;

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
    public void addToList(Human human) {
        humanList.add(human);
    }

    @Override
    public List<Human> findBySurname(String surname) {
        List<Human> humanListOfSameSurname = new ArrayList<>();
        for (Human human : humanList) {
            if (human.getSurname().equals(surname)) {
                humanListOfSameSurname.add(human);
            }
        }
        return humanListOfSameSurname;
    }

    @Override
    public List<Human> findByName(String name) {
        List<Human> humanListOfSameName = new ArrayList<>();
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
                humanListOfSameName.add(human);
            }
        }
        return humanListOfSameName;
    }
}
