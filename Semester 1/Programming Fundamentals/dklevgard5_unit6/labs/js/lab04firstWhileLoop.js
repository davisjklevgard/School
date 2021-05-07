/*
  This is the JavaScript code for
  "Lab 4: Your First While Loop"
  File: /unit6/labs/lab04firstWhileLoop.html
*/
function lab04firstWhileLoop() {
  // Your code goes in here.
  var stringSomething = "";
  var counter = 0;
  
  while(counter < 5){
    stringSomething = prompt("Enter something:");
    document.write("You entered: " + stringSomething + "\n");
    counter++;
    }
    document.write("\nThanks for participating!");
    
}


lab04firstWhileLoop();
