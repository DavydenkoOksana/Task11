package ua.hillel.oop.ui;

import ua.hillel.oop.entities.Human;

import java.util.List;
import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {
    private Scanner sc;

    public HumanConsoleUI(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public Human readHuman() {
        System.out.println("Please enter human's name, surname and patronymic");
        return new Human(sc.next(), sc.next(), sc.next());
    }

    @Override
    public void showList(List<Human> humanList) {
        for (int i = 0; i < humanList.size(); i++) {
            System.out.println((i + 1) + " " + humanList.get(i));
        }
    }

    @Override
    public int readHumanNumberForDelete() {
        System.out.println("Please enter the number of the human, which you would like to delete from the list");
        return sc.nextInt() - 1; //convert number to index of list
    }

    @Override
    public String readSurname() {
        System.out.println("Please enter the needed surname");
        return sc.nextLine();
    }

    @Override
    public String readName() {
        System.out.println("Please enter the needed name");
        return sc.nextLine();
    }

}
