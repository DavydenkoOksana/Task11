package ua.hillel.oop.menu.base;

import ua.hillel.oop.exception.InvalidChoice;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> items;
    private Scanner sc;

    public Menu(List<MenuItem> items, Scanner sc) {
        this.items = items;
        this.sc = sc;
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            try {
                invalidChoice(choice);
                items.get(choice).exec();
                if (items.get(choice).closeAfter()) break;
            } catch (InvalidChoice e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void invalidChoice(int choice) throws InvalidChoice {
        if (choice < 0 || choice >= items.size()) {
            throw new InvalidChoice("Error, choice is out of bound,please try again");
        }
    }

    private void showMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + " - " + items.get(i).getName());
        }
    }

    private int getUserChoice() {
        while (true) {
            try {
                System.out.println("Please choose your option");
                return sc.nextInt() - 1;
            } catch (Exception e) {
                System.out.println("Error, please enter the number");
            } finally {
                sc.nextLine();
            }
        }
    }
}
