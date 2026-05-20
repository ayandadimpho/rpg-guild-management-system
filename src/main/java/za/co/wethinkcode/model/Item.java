package za.co.wethinkcode.model;

public abstract class Item {

    // TODO: declare private fields:
    private int id;
    private String name;
    private int value;

    // TODO: implement constructor:
    public Item(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    // TODO: implement getters:
    // int getId()

    public int getId() {
        return id;
    }

    // String getName()

    public String getName() {
        return name;
    }

    // int getValue()

    public int getValue() {
        return value;
    }

    // TODO: implement updateValue(int newValue)
    // Throws IllegalArgumentException if newValue < 0
    public void updateValue(int newValue) {
        if (newValue < 0) {
            throw new IllegalArgumentException();
        }
        this.value = newValue;
    }

    // TODO: implement abstract method:
    // String itemType()
    public abstract String itemType();

    // TODO: override toString()
    // Example:
    // [Weapon] Sword (ID: 1, Value: 150)
    public String toString() {
       String newString = "[" + itemType() + "] " + getName() + " (ID: " + getId() + ", " + "Value: " + getValue() + ")";
        return newString;
    }
}