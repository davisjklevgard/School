/*
  This is file /unit6/example_1.js
  It contains the JavaScript code for

  "Fahrenheit-Celsius Conversion" File: /unit6/example_1.html
*/

// Convert a Fahrenheit temp to a Celsius temp.
function ConvertFahrenheitToCelsius(fahrenheitTemperature) {
  var result = 0;
  fahrenheitTemperature = Number(fahrenheitTemperature);
  result = (fahrenheitTemperature - 32) * (5 / 9);
  return(result);
}

// Main program
function ConvertFiveTemperatures() {

  // Declare variables
  var counter = 0;
  var currentFahrenheitTemperature = 0;
  var currentCelsiusTemperature = 0;
  var finalMessage = "All temperatures processed";
  var loopLimit = 5;
  var outputString = "";

  // Get user data, convert to celsius and display
  while (counter < loopLimit) {
    currentFahrenheitTemperature = prompt("Enter Fahrenheit " +
      "temperature number " + (counter + 1) +
      " of " + loopLimit);
    if(isNaN(currentFahrenheitTemperature)) {
      alert("That's not a number. Please enter only numbers.");
    } else {
      currentCelsiusTemperature = ConvertFahrenheitToCelsius(currentFahrenheitTemperature);
      outputString += currentFahrenheitTemperature + " degrees Fahrenheit " +
        "is " + currentCelsiusTemperature + " degrees celsius.\n";
      counter++;
    }
  }

  // Output the final message
  document.write(outputString + finalMessage);
}

ConvertFiveTemperatures();
