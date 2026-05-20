package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // TODO: declare private fields:
    private List<Item> items = new ArrayList<>();

    // TODO: implement constructor:
    // Inventory()
    // - initialise items as new ArrayList<>()
    public Inventory() {
        this.items = new ArrayList<>();
    }

    // TODO: implement addItem(Item item)
    // - add item to list
    public void addItem(Item item) {
        items.add(item);
    }

    // TODO: implement removeItemById(int itemId)
    // - remove item with matching id
    // - return true if removed, false otherwise
    public boolean removeItemById(int itemId) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId()== itemId) {
                items.remove(i);
                return true;
            }

        }return false;
    }


    // TODO: implement getItemById(int itemId)
    // - return Item if found, else null
    public Item getItemById(int itemId) {
        for (int i=0;i<items.size();i++) {
            if(items.get(i).getId() == itemId) {
                return items.get(i);
            }
        }return null;
    }

    // TODO: implement getItems()
    // - return defensive copy of list
    public List getItems() {
        return new ArrayList<>(items);
    }

    // TODO: implement getTotalValue()
    // - sum of all item values
    public int getTotalValue() {
        int sum = 0;
        for (int i=0;i<items.size();i++) {
            sum += items.get(i).getValue();
        }return sum;
    }

    // TODO: implement getTotalItems()
    // - return size of inventory
    public int getTotalItems() {
        return items.size();
    }

    // TODO: implement containsItem(String itemName)
    // - return true if any item matches name
    public boolean containsItem(String itemName) {
        for (int i=0;i<items.size();i++) {
            if(items.get(i).getName().equals(itemName)) {
                return true;
            }
        }return false;
    }

    // TODO: override toString()
    // Example:
    // Inventory:
    // - Sword (ID: 1)
    // - Shield (ID: 2)
    @Override
    public String toString() {
        StringBuilder inventoryString = new StringBuilder();
        inventoryString.append("Inventory:\n");
        for (int i=0;i<items.size();i++) {
            inventoryString.append("- ");
            inventoryString.append(items.get(i).getName());
            inventoryString.append(" (");
            inventoryString.append("ID: ");
            inventoryString.append(items.get(i).getId());
            inventoryString.append(")");
            inventoryString.append("\n");
        }return inventoryString.toString();
    }
}