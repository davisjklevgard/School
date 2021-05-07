/*
  This is the JavaScript code for
  "Lab 11: Arrays"
  File: /unit6/labs/lab10firstLoopStopIf.html
*/
function lab11Arrays() {
  // Your code goes in here.
  var usernames = [];
  var done = true;
  var input;
  
  while (done){
    input = prompt("Enter a username, type done to stop");
    if (input === "done"){
      done = false;
      document.write("You have entered " + usernames.length + " usernames. Here are the email addresses: \n\n");
      for (var index = 0; index < usernames.length; index++){
        document.write(usernames[index] + "@student.cvtc.edu\n");
      }
    } else {
        usernames.push(input);
    }
  }
         
}


lab11Arrays();
