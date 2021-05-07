var NESTED = {};

NESTED.outer = 0;
NESTED.inner = 0;
NESTED.output = "";

function moveLoopForward() {
    
  var localOuter = 0;
  var localInner = 0;
  var output = "";
  var outputPre = document.getElementById("nestedAnimationOutput");
  var countersPre = document.getElementById("outerInnerCountersId");
  
  if (NESTED.outer >= 5) {
    NESTED.outer = 0;
    NESTED.inner = 0;
    NESTED.output = "";
  } else {
    if (NESTED.inner >= 5) {
      NESTED.outer++;
      NESTED.inner = 0;
      NESTED.output += "\n";
    } else {
      NESTED.output += "X";
      NESTED.inner++;
    }
  }
  outputPre.innerHTML = NESTED.output;
  countersPre.innerHTML = "Outer Counter: " 
          + NESTED.outer + "\nInner Counter: " + NESTED.inner;
  
}

function resetLoopDemo() {
  NESTED.outer = 0;
  NESTED.inner = 0;
  NESTED.output = "";
  var outputPre = document.getElementById("nestedAnimationOutput");
  var countersPre = document.getElementById("outerInnerCountersId");
  
  outputPre.innerHTML = NESTED.output;
  countersPre.innerHTML = "Outer Counter: " 
          + NESTED.outer + "\nInner Counter: " + NESTED.inner;
  
}

/*
  This is file /unit6/nestedLoops.js 
  It contains the JavaScript code for
  
  "Nested loops" File: /unit6/nestedLoops.html
*/
function nestedLoops() {
  // Your code goes in here.
  
  document.write("The JavaScript file for this page is: " 
          + "\"/unit6/jsFiles/nestedLoops.js\"");
}

/*
  This is an example of nested looping 
  with while loops.
*/
function firstNestedLoops() {
  
  // Declare variables
  var innerCounter;
  var outerCounter;
  
  // Outer loop
  // Increment its counter first
  outerCounter = 0;
  while (outerCounter < 5) {
            
    // Inner loop
    // Increment its counter first
    innerCounter = 0;
    while (innerCounter < 5) {
      document.write("X");
      innerCounter++;
    }
    document.write("\n");
    outerCounter++;
  }
}