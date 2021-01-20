package ua.hillel.oop.controller;

import ua.hillel.oop.entities.Human;
import ua.hillel.oop.services.HumanService;
import ua.hillel.oop.ui.HumanUI;

import java.util.List;

public class HumanController {
    private HumanUI humanUI;
    private HumanService humanService;

    public HumanController(HumanUI humanUI, HumanService humanService) {
        this.humanUI = humanUI;
        this.humanService = humanService;
    }

    public void addHumanOption() {
        Human human = humanUI.readHuman();
        if (humanService.isContainHuman(human)) {
            System.out.println("User " + human + " already exist");
        } else {
            humanService.addToList(human);
        }
    }

    public void showListOption() {
        humanUI.showList(humanService.getHumans());
    }

    public void deleteNumberOption() {
        humanService.deleteFromList(humanUI.readHumanNumberForDelete());
    }

    public void findBySurnameOption() {
        String surname = humanUI.readSurname();
        List<Human> surnameList = humanService.findBySurname(surname);
        if (surnameList.size() == 0) {
            System.out.println("User with surname " + surname + " is not found");
        } else {
            humanUI.showList(surnameList);
        }
    }

    public void findByNameOption() {
        String name = humanUI.readName();
        List<Human> nameList = humanService.findByName(name);
        if (nameList.size() == 0) {
            System.out.println("User with surname " + name + " is not found");
        } else {
            humanUI.showList(nameList);
        }
    }
}
