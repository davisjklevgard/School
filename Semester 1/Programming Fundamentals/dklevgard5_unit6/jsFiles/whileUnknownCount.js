/*
  This is file /unit6/whileUnknownCount.js 
  It contains the JavaScript code for
  
  "A while loop with unknown loop count" 
  File: /unit6/whileUnknownCount.html
*/
function whileUnknownCount() {
  // Your code goes in here.
  
  document.write("The JavaScript file for this page is: "
          + "\"/unit6/jsFiles/whileUnknownCount.js\"");
}

/*
  This function is in file /unit7/whileUnknowCount.js
  It loops until the user enters "quit"
*/
function askForNumbers() {
  var number;
  var total = 0;
  
  while (number !== "quit") {
    number = prompt("Enter a number or \"quit\"");
    if (number !== "quit") {           
      number = Number(number);
      total += number;
      document.write("You entered: " + number + "<br />");
    }
  }
  document.write("Your total is: " + total + "<br />Goodbye!");
}

/*
  This function is in file /unit7/whileUnknowCount.js
  It loops until the user enters 5
*/

function lookForFive() {
  var number;
  var counter = 1;

  while (number !== "5") {
    number = prompt("Enter the number " + counter);
    document.write("You entered " + number + "<br />");
    counter++;
  }
  document.write("Bye, bye!");
}

function quickExamScoresExample() {
  var results;
  
  results = openStudentExamRecords();
  
  while (results.readNextRecord()) {
    document.write(results.getStudentName() + ", " 
      + results.getStudentScore() + "<br />");
  }
}










