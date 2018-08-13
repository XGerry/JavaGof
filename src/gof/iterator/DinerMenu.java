package gof.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] items;

    public DinerMenu() {
        items = new MenuItem[MAX_ITEMS];
        addItem("VB", "test", true, 2.99);
    }

    private void addItem(String name, String desc, boolean vegerarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegerarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full");
        } else {
            items[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(items);
    }
}
