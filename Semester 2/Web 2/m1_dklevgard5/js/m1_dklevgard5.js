function init(){

  /*
  console.log('Hello from Sasquatch');

  //var bigfootname = prompt('What is your favorite name for Bigfoot?','Sasquatch');

  //document.write("<h2>That's classic juvenille " + bigfootname + "behavior</h2>");
  // document.write("<h2>That's classic juvenille " + prompt('What is your favorite name for Bigfoot?','Sasquatch') + " behavior</h2>");

  let num1 = Number(prompt('Please enter a positive number', 10));
  let num2;

  //
  //test if num1 is a positive number and keep reprompting till it is
  //

  while (isNaN(num1) || num1 <= 0) {
     num1 = Number(prompt('Please reenter a positive number', 10));
  }

  //NOW, use a do/while loop to prompt for and validate a second positive number

  do {
    num2 = Number(prompt('Please enter a second positive number', 20));
  } while (isNaN(num2) || num2 <= 0); 

  console.log("Made it: num1 = " + num1 + " *** num2 = " + num2);

  if (num1 > num2) {
    document.write(num1 + ' is greater than ' + num2 + '<br><br>');
  } else if (num1 < num2) {
    document.write(num1 + ' is less than ' + num2 + '<br><br>');
  } else {
    document.write(num1 + ' is equal to ' + num2 + '<br><br>');
  }

  //
  //The let keyword
  //is used to declare a variable.  Let is block-scope (lexical)
  //where as var is function-scoped.
  //
  //Note: re-declaring a variable using let will cause an error
  //
  let x = 10;

  if (x == 10) {
    let x = 20; // this x is local to the if block

    console.log("Inside the if's {}, x = " + x);
  }

  console.log("Outside the if's {}, x = " + x);

  //
  //For Loop example
  //
  //for (initializer; condition; increment) { body }
  for (let i = 0; i <= num2; i+=1) {

    // display i only if it is an even number
    if (!(i % 2)) {
      document.write('<br>i contains : ' + i)
    }


  }

  


  //Arrays in JavaScript
  //
  // Create an empty array (or reset an array)

  //let homeTowns = new Array();
  //let homeTowns = []; 

  // Declare and initialize an array
  let homeTowns = ["Eau Claire", "Siren", "Fall Creek", "Chippewa Falls", "Osseo", "Menomonie"]

  

  let myHomeTown = "Strum";

  //homeTowns[homeTowns.length] = myHomeTown;
  homeTowns.push(myHomeTown);

  homeTowns.unshift("BarronEleva");

  console.log(homeTowns + ' # of elements = ' + homeTowns.length);

  // Iterate through our array one element at a time 
  document.write("<ul>");

  for (let i = 0; i < homeTowns.length; i++) {
    document.write("<li>" + homeTowns[i] + "</li>");
  }

  document.write("</ul>");

  //Alternative - iterate through our array one element at a time 
  // using a foreach loop

  document.write("<ul>");

  homeTowns.forEach(function(currentHomeTown) {
    document.write("<li>" + currentHomeTown + "</li>");
  });

  document.write("</ul>");


  // A second type of array
  //
  // Associative array (hash or dictionary)
  //
  //Only difference between associative array and vector (normal)
  // arrays is what the indexes are. 
  //
  // Vector arrays: indexes are intergers that begin at 0 and increase by 1
  //Associative arrays: indexes (officially called keys) are unique string values. Each element is referred to as a "key-value" pair.
  //In both types of arrays, the indexes must be unique
  //
  var zipCodes = [];

  zipCodes["Eau Claire A"] = 54701;
  zipCodes["Eau Claire B"] = 54702;
  zipCodes["Eau Claire C"] = 54703;
  zipCodes["Fall Creek"] = 54742;
  zipCodes["Siren"] = 54872;
  zipCodes["Chippewa Falls"] = 54729;
  zipCodes["Strum"] = 54770;


  document.write("<ul>");

  for (town in zipCodes) {
    document.write("<li>The zip code for " + town + " is " + zipCodes[town] + "</li>")
  }

  document.write("</ul>");

  */

  // Objects in JavaScript
  //
  // Objects are made of properties (attributes)
  // 
  // Object notation operator is a period(.) and is used to create and or access properties of an object in this format: object.property
  //
  //What can a property be in JavaScript?
  //
  //1) Variable (attribute/field) eg color of a car: car.color = "red";
  //2) method (function that is defined as part of an object/class)
  //3) Object (child of the object on the left side of the .) 
  //      eg car.engine;
  //      eg car.engine.piston.pump();
  //
  // 4) event eg window.onload = doSomething; 
  //
  //Objects (classes) are often defined as functions in JavaScript
  // (Constructors and methods)
  //
  //Objects can be implemented literally in JavaScript. These objects are 
  // referred to as object literals. 

  // Object literals: Use {} that sit off by themselves
  // o Can represent the concept of a class
  // o Require a special syntax (rules) called object literal syntax
  //    An object literal s defined using a set of {} 
  //    that sit by themselves
  //      Inside the {}, the properties of the object will take on 
  //      following syntax: 
  //
  //      propertyName: propertyValue,
  //      propertyName: propertyValue,
  //      .
  //      .
  //      .
  //      propertyName: propertyValue
  //

  //Let's redo the below object literal as a class using 
  //JavaScript ES6/8 syntax..
  class BaseballPlayer{

    constructor(playerName){
      this.player = playerName;
    }
    playerNumber = 51;

    static battingAverage = function(numAtBats, numHits) {

      if(numAtBats <= 0 || numHits < 0) {
        return .000.toFixed(3);
      }

      return (numHits/numAtBats).toFixed(3);
    };

    bat = {
      genre: {
        sport: 'Softball',
        weight: '24oz'
      },

      swing: function() {
        //TODO
      },
      
      material: {
        wood1: 'Maple',
        wood2: 'Oak',
        metal: 'Aluminum'
      }
    };

  }




  // let BaseballPlayer = {
    // playerNumber: 51,

    // battingAverage: function(numAtBats, numHits) {

    //   if(numAtBats <= 0 || numHits < 0) {
    //     return .000.toFixed(3);
    //   }

    //   return (numHits/numAtBats).toFixed(3);
    // },

    // bat: {
    //   genre: {
    //     sport: 'Softball',
    //     weight: '24oz'
    //   },

    //   swing: function() {
    //     //TODO
    //   },
      
    //   material: {
    //     wood1: 'Maple',
    //     wood2: 'Oak',
    //     metal: 'Aluminum'
    //   }
    // }
  // };

  // BaseballPlayer.playerName = "Casey"

  // BaseballPlayer.statistics = function() {
  //   //code in here...
  // }

  // console.log("wood2 material = " + BaseballPlayer.bat.material.wood2);
  // BaseballPlayer.bat.material.wood2 = "Ash"
  // console.log("wood2 material = " + BaseballPlayer.bat.material.wood2);

  // console.log(BaseballPlayer.playerName + "'s number is " + BaseballPlayer.playerNumber);

  
  // console.log(BaseballPlayer.playerName + "'s batting average is " + formatAverage(BaseballPlayer.battingAverage(400, 100)));

  let numAtBats,
      numHits,
      baseballPlayerObject = new BaseballPlayer("Casey");

      //Note: must call this function below where it is defined
      //as no "hoisting" takes place...
      formatAverage = function(battingAvg) {
        return String(battingAvg).replace(/^0/, '');
      };

      //The below definition works when called from above this point 
      //due to "hoisting".
      //
      // function formatAverage(battingAvg) {
      //   return String(battingAvg).replace(/^0/, '');
      // };

  console.log(baseballPlayerObject.player + "'s batting average is " + formatAverage(BaseballPlayer.battingAverage(400, 100)));

  //Prompt for and validate the number of at bats
  do {
    numAtBats = Number(prompt("Number of at bats: ", 1));
  }while (numAtBats === '' || isNaN(numAtBats) || (parseInt(numAtBats) != parseFloat(numAtBats)) || numAtBats <= 0);


  //Prompt for and validate number of hits
  do {
    numHits = Number(prompt("Number of hits: ", 0));
  }while (numHits === '' || isNaN(numHits) || (parseInt(numHits) != parseFloat(numHits)) || numHits < 0 
  || numHits > numAtBats);

  document.write('<body style="background-color:#000"><h2 style="color: #72e211">' + baseballPlayerObject.player + "'s batting average is " + formatAverage(BaseballPlayer.battingAverage(numAtBats, numHits)) + "</h2></body>")

}