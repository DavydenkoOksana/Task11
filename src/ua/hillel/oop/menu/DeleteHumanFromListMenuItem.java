package ua.hillel.oop.menu;

import ua.hillel.oop.controller.HumanController;
import ua.hillel.oop.menu.base.MenuItem;

public class DeleteHumanFromListMenuItem extends MenuItem {
    private HumanController humanController;

    public DeleteHumanFromListMenuItem(HumanController humanController) {
        super("Delete human from the list");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.deleteNumberOption();
    }
}
