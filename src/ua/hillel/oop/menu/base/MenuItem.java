package ua.hillel.oop.menu.base;

 public abstract class MenuItem {
    private String name;
    private boolean closeAfter;

    public MenuItem(String name) {
        this.name = name;
        this.closeAfter = false;
    }

    public MenuItem(String name, boolean closeAfter) {
        this.name = name;
        this.closeAfter = closeAfter;
    }

    public String getName() {
        return name;
    }
    public abstract void exec();

    public boolean closeAfter(){
        return closeAfter;
    }
}
