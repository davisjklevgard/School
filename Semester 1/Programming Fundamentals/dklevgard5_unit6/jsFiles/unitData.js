/******************************************************************************

Filename: unitData.js
Purpose: This file contains Classes to assist in 
         learning JavaScript Looping.
******************************************************************************/

/*
  This is the Inventory Items Records Class for Example 5.4
  Usage:
  
  The records are made available to lab scripts with this function.
  
      var inventoryItems = openIventoryItemsRecords();
  
  Then you need to start a loop and test the readNextRecord() method. In the
  loop you need to call the individual methods for fields

      while(inventoryItems.readNextRecord()) {
          ...
      }
      
  Inside the loop the data for each row is retrieved with these methods:
  
      inventoryItems.getItemNumber();
      inventoryItems.getItemDescription();
      inventoryItems.getItemStockAmount();
              
  These methods return data for the current record.
*/
var InventoryItemsRecords = function() {
  this.inventoryItemsData =  [
    [200, "Widgets", 25],
    [201, "Gadgets", 17],
    [202, "Dodads", 30],
    [203, "Toggles", 12],
    [204, "Doilies", 25],
    [205, "FooBars", 1],
    [206, "Fidgets", 20],
    [207, "Fiddles", 19],
    [208, "Faddles", 10],
    [209, "Frills", 9]
  ];
  
  this.position = -1;
}

// retrieves the item number from the current record
InventoryItemsRecords.prototype.getItemNumber = function () {
  return this.inventoryItemsData[this.position][0];
};

// retrives the description for the current record
InventoryItemsRecords.prototype.getItemDescription = function () {
  return this.inventoryItemsData[this.position][1];
};

// retrieves the item stock amount from the current record
InventoryItemsRecords.prototype.getItemStockAmount = function () {
  return this.inventoryItemsData[this.position][2];
};

// moves to the next record in the set.
// Returns true if there's a record, false if no next record.
// The record itself is not returned. Use the getters
// to access the record.
InventoryItemsRecords.prototype.readNextRecord = function () {
  this.position++;
  if (this.position >= this.inventoryItemsData.length) {
    this.position = 0;
    return false;
  } else {
    return true;
  }
};

var openInventoryItemsRecords = function() {
  return new InventoryItemsRecords();
}

