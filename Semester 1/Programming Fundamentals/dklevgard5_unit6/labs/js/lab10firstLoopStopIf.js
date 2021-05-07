/*
  This is the JavaScript code for
  "Lab 10: Stopping Loops IF"
  File: /unit6/labs/lab10firstLoopStopIf.html
*/
function lab10firstLoopStopIf() {
  // Your code goes in here.
  var numberIn; 
  var total = 0;
  
  
  while (numberIn != 0) { 
    numberIn = prompt("Enter a number greater than 0, enter 0 to stop");
    numberIn = Number(numberIn);
    total += numberIn;
    document.write("Number entered: " + numberIn + "\n");
    if (numberIn == 0) {
      document.write("Total of all numbers entered: " + total + "\n");
      document.write("Good bye!");
    }
  }
}

lab10firstLoopStopIf();
