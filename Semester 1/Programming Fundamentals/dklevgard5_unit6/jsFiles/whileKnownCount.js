/*
  This is file /unit6/whileKnownCount.js 
  It contains the JavaScript code for
  
  "A while loop with a known loop count" 
  File: /unit6/whileKnownCount.html
*/
function whileKnownCount() {
  // Your code goes in here.
  
  document.write("The JavaScript file for this page is: "
          + "\"/unit4/jsFiles/whileKnownCount.js\"");
}

/*
  This function is in file /unit7/whileKnownCount.js
  It loops five times with a while loop
*/
function whileFiveTimes() {
  var counter = 0;
  var loopLimit = 5
  
  while (counter < loopLimit) {
    document.write("This is loop number: " + counter + "<br />");
    counter++;
  }
}

/*
  This function is in file /unit7/whileKnownCount.js
  It loops five times with a for loop
*/
function forFiveTimes() {
  var loopLimit = 5;
  var counter;
  
  for (counter = 0; counter < loopLimit; counter++) {
    document.write("This is loop number: " + counter + "<br />");
  }
}
