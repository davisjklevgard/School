package edu.cvtc.java;

public class ReturnObject {

    public static void main(String[] args) {

        InventoryItem item = getData();

        System.out.println("Description: " + item.getDescription());
        System.out.println("Units: " + item.getUnits());

        item.setDescription("Hammer");
        item.setUnits(10);

        System.out.println("Description: " + item.getDescription());
        System.out.println("Units: " + item.getUnits());
    }

    public static InventoryItem getData() {

        String description = "Shovel";
        int units = 20;

//    InventoryItem inventoryItem = new InventoryItem(description, units);
//
//    return inventoryItem;

        return new InventoryItem(description, units);

    }

}


