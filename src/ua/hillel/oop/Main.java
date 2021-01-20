package ua.hillel.oop;

import ua.hillel.oop.controller.HumanController;
import ua.hillel.oop.menu.*;
import ua.hillel.oop.menu.base.Menu;
import ua.hillel.oop.menu.base.MenuItem;
import ua.hillel.oop.services.HumanConsoleService;
import ua.hillel.oop.services.HumanService;
import ua.hillel.oop.ui.HumanConsoleUI;
import ua.hillel.oop.ui.HumanUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanUI humanUI = new HumanConsoleUI(sc);
        HumanService humanService = new HumanConsoleService();
        HumanController humanController = new HumanController(humanUI, humanService);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new AddHumanMenuItem(humanController));
        menuItems.add(new ShowListMenuItem(humanController));
        menuItems.add(new DeleteHumanFromListMenuItem(humanController));
        menuItems.add(new FindHumanBySurnameMenuItem(humanController));
        menuItems.add(new FindHumanByNameMenuItem(humanController));
        menuItems.add(new ExitMenuItem());

        Menu menu = new Menu(menuItems, sc);
        menu.run();
    }
}
