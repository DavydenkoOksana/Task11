package ua.hillel.oop.menu;

import ua.hillel.oop.controller.HumanController;
import ua.hillel.oop.menu.base.MenuItem;

public class FindHumanByNameMenuItem extends MenuItem {
    private HumanController humanController;

    public FindHumanByNameMenuItem(HumanController humanController) {
        super("Find the human/people by name");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.findByNameOption();
    }
}

