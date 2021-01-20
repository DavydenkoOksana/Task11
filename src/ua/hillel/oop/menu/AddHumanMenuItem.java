package ua.hillel.oop.menu;

import ua.hillel.oop.controller.HumanController;
import ua.hillel.oop.menu.base.MenuItem;

public class AddHumanMenuItem extends MenuItem {
    private HumanController humanController;

    public AddHumanMenuItem(HumanController humanController) {
        super("Add new human");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.addHumanOption();
    }
}
