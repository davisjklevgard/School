

  let total = 0; 

  var fName = prompt('Please enter your first name:');

  while(fName === ""){
    fName = prompt('Reminder: Please enter your first name:');
  }

  let numDice = Number(prompt('How many dice would you like to roll?'));

  while (isNaN(numDice) || numDice <= 0 || parseFloat(numDice) != parseInt(numDice)) {
    numDice = Number(prompt('Reminder: How many dice would you like to roll? \nNumber should be a positive integer'));
 }

 if (numDice == 1){
 document.write("Rolling 1 die...");
 } else{
     document.write("Rolling " + numDice + " dice...");
 }

 document.write("<br>Hi " + fName + ", you have rolled a ");


 for(let i = 1; i <= numDice; i++){
  let value = Math.floor((Math.random() * 6) + 1);
  alert("Dice #" + i + " is a " + value );
  total += value; 
  
  if(i != numDice || numDice == 1){

    if(numDice <=2){
        document.write(value + " ");
        
    }else {
          document.write(value + ", ")
    }

  }else {
    document.write(" and " + i);
    
  }

 }
 document.write(" for a  grand total of " + total);
 document.write("");
