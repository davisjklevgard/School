/*
  This is the JavaScript code for
  "Lab 5: Your First For Loop"
  File: /unit6/labs/lab05firstForLoop.html
*/
function lab05firstForLoop() {
  // Your code goes in here.
  var stringInput
  
  for(var counter = 0; counter < 5; counter++){
    stringInput = prompt("Enter input");
    document.write("You entered: " + stringInput + "\n");
  }
  
  document.write("\nThanks for participating!")
}

lab05firstForLoop();
