/*
  This is file /unit6/jsFiles/loopAndIfs.js 
  It contains the JavaScript code for
  
  "Combining loop and if structures" File: /unit6/loopAndIfs.html
*/
function loopAndIfs() {
  // Your code goes in here.
  
  document.write("The JavaScript file for this page is: \"/unit6/jsFiles/loopAndIfs.js\"");
}

/*
  This function asks for entries from a user
  and displays the entry on the page. It will
  continue asking for entries until the user
  enters "quit".
*/
function quickLoopsIfs() {
  var entry;
  var loopAgain = true;
  
  while (loopAgain) {
    entry = prompt("Please enter something or " 
                + " \"quit\" to stop.");
    
    if (entry === "quit") {
      loopAgain = false;
      document.write("Good, bye!");
    } else {
      document.write("You entered: " + entry + "\n");
    }
  }
}


/*
  This function prompts the user for a series of 
  numbers and stores how many even and odd numbers 
  were entered. It also checks the data to make 
  sure it is a number. The function displays 
  the results and ends when the user enters "quit".
*/
function aLittleBiggerExample() {
    
  // Declare variables
  var evens = 0;
  var odds = 0;
  var entry;
  var loopAgain = true;
  
  // loop and get input
  while (loopAgain) {
    entry = prompt("Enter a number, any number, " 
            + "or \"quit\" to stop.");
    if (entry === "quit") {
      loopAgain = false;
    } else if (isNaN(entry)) {
      alert(entry + " is not a number, " 
                + "please try again.");
    } else if (Number(entry) % 2 === 0) {
      evens++;
    } else if (Number(entry) % 2 === 1) {
      odds++;
    } else {
      alert("What kind of number did you " 
                + "enter? Please try again.");
    }
  }
    
  // Display the results
  document.write("You entered " + evens 
          + " even number(s).\n");
  document.write("You entered " + odds 
          + " odd number(s).\n");
}


/*
  The simple test to stop a loop
*/
function firstStop() {
  
  // Declare variables
  var entry;
  
  while (entry !== "quit") {
    entry = prompt("Enter a word, \"quit\" to stop.");
    document.write("You entered: " + entry + "\n");        
  }
}

/*
  A simple way to stop a loop and only do a task if
  the user did not enter "quit".
*/
function secondStop() {
    
  // Declare variables
  var entry;
  var total = 0;
  
  while (entry !== "quit") {
    entry = prompt("Enter a number or \"quit\" to stop.");
    if (entry !== "quit") {
      entry = Number(entry);
      total += entry;
    }
  }
  document.write("Total: " + total);
}

/*
  Take one of 2 paths depending on what is entered.
  Or quit when "quit" is entered.
*/
function thirdStop() {

  // Declare variables
  var shortWords = 0;
  var longWords = 0;
  var entry;
  var wordLength;

  while (entry !== "quit") {
    entry = prompt("Enter a word or \"quit\" to stop.");
    if (entry !== "quit") {
      wordLength = entry.length;
      if (wordLength <= 5) {
        shortWords++;
      } else {
        longWords++;
      }
    }
  }
  
  document.write("You entered " + longWords + " Long words and " 
                 + shortWords + " Short words.");
}


/*
  Stop a loop with a boolean variable
*/
function stopWithBooleanVar() {
    
  // Declare variables
  var loopTest = true;
  var entry;
  
  while (loopTest) {
    entry = prompt("Enter a number greater than 10");
    entry = Number(entry);
    if (entry > 10) {
      alert("You entered: " + entry);
    } else {
      loopTest = false;
      alert("Good, bye!");
    }
  }
    
}

/*
  Stop a loop with the break; statement
*/
function breakIt() {
  // Declare variables
  var count = 0;
  var loopMaximum = 25;
  var countSquared;
  
  while (true) {
    document.write(count);
    
    if (count > loopMaximum) {
      document.write(" is too big!");
      break;
    }
    
    countSquared = count * count;
    document.write(" squared is " + countSquared + "\n");
    count++;
  }
}

function isNaNDemos() {
  document.write("isNaN(\"100\") --> " + isNaN("100") + "<br />");
  document.write("isNaN(\"-100\") --> " + isNaN("-100") + "<br />");
  document.write("isNaN(\"12.99\") --> " + isNaN("12.99") + "<br />");
  document.write("isNaN(\"5e10\") --> " + isNaN("5e10") + "  <-- Exponential Number\n");
  document.write("isNaN(\"100abc\") --> " + isNaN("100abc") + "  <-- Trailing characters\n");
  document.write("isNaN(\"abc100\") --> " + isNaN("abc100") + "  <-- Preceding characters\n");
  document.write("isNaN(\"100    \") --> " + isNaN("100    ") + "  <-- Trailing spaces\n");
  document.write("isNaN(\"    100\") --> " + isNaN("    100") + "  <-- Preceding spaces\n");
  document.write("isNaN(\"100   200\") --> " + isNaN("100   200") + "\n");
  document.write("isNaN(\"100   abc\") --> " + isNaN("100   abc") + "\n");
  document.write("isNaN(\"0x2\") --> " + isNaN("0x2") + "  <-- Hexadecimal number\n");
  document.write("isNaN(\"ten\") --> " + isNaN("ten") + "  <-- Don't laugh, I've seen it!");
}










