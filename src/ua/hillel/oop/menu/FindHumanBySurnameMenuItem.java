package ua.hillel.oop.menu;

import ua.hillel.oop.controller.HumanController;
import ua.hillel.oop.menu.base.MenuItem;

public class FindHumanBySurnameMenuItem extends MenuItem {
    private HumanController humanController;

    public FindHumanBySurnameMenuItem(HumanController humanController) {
        super("Find the human/people by surname");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        humanController.findBySurnameOption();
    }
}
