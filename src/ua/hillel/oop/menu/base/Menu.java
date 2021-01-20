package ua.hillel.oop.menu.base;

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
            if (isChoiceValid(choice)){
                System.out.println("Error, please choose another option");
                continue;
            }
            items.get(choice).exec();
            if(items.get(choice).closeAfter()) break;
        }
    }

    private boolean isChoiceValid(int choice) {
        return choice < 0 || choice >= items.size();
    }

    private void showMenu(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + " - " + items.get(i).getName());
        }
    }

    private int getUserChoice() {
        System.out.println("Please choose your option");
        int choice = sc.nextInt() - 1;
        sc.nextLine();
        return choice;
    }
}
