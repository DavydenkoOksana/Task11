package ua.hillel.oop.menu;

import ua.hillel.oop.menu.base.MenuItem;

public class ExitMenuItem extends MenuItem {

    public ExitMenuItem() {
        super("Exit",true);
    }

    @Override
    public void exec() {
        System.out.println("The end of the program");
    }
}
