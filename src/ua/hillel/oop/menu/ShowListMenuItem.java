package ua.hillel.oop.menu;

import ua.hillel.oop.controller.HumanController;
import ua.hillel.oop.menu.base.MenuItem;

public class ShowListMenuItem extends MenuItem {
    private HumanController humanController;

    public ShowListMenuItem(HumanController humanController) {
        super("Display the list");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.showListOption();
    }
}
