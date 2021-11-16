package edu.cvtc.java;

public class PassObject {

    public static void main(String[] args) {

        InventoryItem inventoryItem = new InventoryItem("Wrench", 20);

        displayItem(inventoryItem);

        System.out.println("Description: " + inventoryItem.getDescription());
        System.out.println("Units: " + inventoryItem.getUnits());
    }

    public static void displayItem(InventoryItem item) {
        System.out.println("Description: " + item.getDescription());
        System.out.println("Units: " + item.getUnits());

        item.setDescription("Hammer");
        item.setUnits(10);

    }

}
