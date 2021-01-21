package ua.hillel.oop.controller;

import ua.hillel.oop.entities.Human;
import ua.hillel.oop.exception.AlreadyExistException;
import ua.hillel.oop.exception.NotFoundException;
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
        try {
            humanService.addToList(human);
        } catch (AlreadyExistException e) {
            System.out.println(e.getMessage());
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
        try {
            List<Human> surnameList = humanService.findBySurname(surname);
            humanUI.showList(surnameList);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findByNameOption() {
        String name = humanUI.readName();
        try {
            List<Human> nameList = humanService.findByName(name);
            humanUI.showList(nameList);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
