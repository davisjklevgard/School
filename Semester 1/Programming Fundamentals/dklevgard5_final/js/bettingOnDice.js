function bettingOnDice(){
  //Initialize all variables
  var money = 1000000;
  var bet = 0;
  var lost;
  var won = money + (bet * 2); 
  var dice;
  
  //loop for betting
  while (bet !== "cash out" || money > 0){
    bet = prompt("Money on hand: " + money + "\nEnter bet amount or \"cash out\" to leave");
   
    //ending the loop
    if (bet == "cash out"){
      document.write("Thanks for playing my game!");
      return;
    }
    // used if someone bets too much money
    if (bet > money){
      document.write("You are betting more than you have. Can't do that.\n");
      continue;
    }
    //dice roll
    dice = Math.floor((Math.random() * 12) + 2); 
    //losing if statement
    if (dice == 2 || dice == 3 || dice == 4 || dice == 6 || dice == 8 || dice == 10 || dice == 12){
      lost = bet;
      money = money - lost;
      document.write("The dice was " + dice + ". You lost the bet." + "\n");
      document.write("Your money now equals " + money + "\n");
    } else if (dice == 5 || dice == 9 || dice == 11){ //draw if statement
      document.write("The dice was " + dice + ". It is a draw." + "\n");
      document.write("Your money is returned." + "\n");
    } else { //winning statement
      won = bet;
      money = money + 2*won;
      document.write("The dice was 7. You won!" + "\n");
      document.write("Your money now equals " + money + "\n");
    }
  }
}

bettingOnDice();