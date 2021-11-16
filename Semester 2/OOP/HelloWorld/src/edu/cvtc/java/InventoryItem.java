package edu.cvtc.java;
/*
  Author: Eric Wackwitz
*/

public class InventoryItem {

    // Attributes
    private String description;
    private int units;

    // Default Constructor
    public InventoryItem() {
        description = "";
        units = 0;
    }

    // Overloaded Constructors
    public InventoryItem(String description) {
        this.description = description;
        units = 0;
    }

    public InventoryItem(String description, int units) {
        this.description = description;
        this.units = units;
    }

    // Methods
    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
