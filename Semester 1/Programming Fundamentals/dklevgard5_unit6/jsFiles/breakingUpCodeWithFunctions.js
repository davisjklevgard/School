function helloWorld(){
  document.write("<h1>Hello World</h1>");
}


function squareNumber(number){
  var square;
  square = number * number;
  return(square);
}

function squareNumber_fixed(number){
  var square;

  // convert to number if the value is not a number.
  if (isNaN(number)){
    number = Number(number);
  }

  square = number * number;
  return(square);
}


// Returns true if they can drive, false if they can't.
function canDrive(age){
  var legalDrivingAge = 16;
  var result;

  age = Number(age);
  result = age >= legalDrivingAge;
  return(result);
}


// Wraps the given message with paragraph
// tags and uses document.write to display
// it to the screen.
function displayMessageToUser(message){
  document.write("<p>" + message + "</p>");
}
