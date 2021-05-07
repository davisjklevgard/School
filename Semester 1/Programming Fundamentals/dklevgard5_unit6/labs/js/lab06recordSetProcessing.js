/*
  This is the JavaScript code for
  "Lab 6: Record Set Processing"
  File: /unit6/labs/lab06recordSetProcessing.html
*/
function lab06recordSetProcessing() {
  // Your code goes in here.
  // Declare Variables
  var currentDescription;
  var currentNumber;
  var currentStockAmount;
  var itemRecords;
  //ADD CODE HERE for two new variables with their values set to 0.
  // One for the totalRecords and one for the totalStockAmount


  // Open the Inventory Items Records and make them
  // available to the script
  itemRecords = openInventoryItemsRecords();

  document.write("The Inventory Items Record Set:<br /><br />");

  // Read the next record, test to see if there
  // is a next record and then output it
  while (itemRecords.readNextRecord()) {
    currentNumber      = itemRecords.getItemNumber();
    currentDescription = itemRecords.getItemDescription();
    currentStockAmount = itemRecords.getItemStockAmount();
    currentStockAmount = Number(currentStockAmount);
    //ADD CODE HERE to accumulate the currentStockAmount
    // Think - what do you need to do with totalStockAmount and currentStockAmount
    // if currentStockAmount is the number of items for the current record?



    //ADD CODE HERE to increment the number of records you processed.
    // Think - how do you know how many records you
    // processed?

    document.write(currentNumber + "\t" + currentDescription  +
                   "\t" + currentStockAmount + "<br />");
  }
  //ADD CODE HERE to display the two additional lines of output
  document.write("The JavaScript file that produced this output is: " +
                 "\"/unit6/labs/js/lab06recordSetProcessing.js\"");
}


lab06recordSetProcessing();
