package ua.hillel.oop.ui;

import ua.hillel.oop.entities.Human;

import java.util.List;


public interface HumanUI {
    Human readHuman();
    int readHumanNumberForDelete();
    String readSurname();
    String readName();
    void showList(List<Human> humanList);
}
