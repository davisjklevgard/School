function Bet(){
  var money = 1000000;
  var bet;
  var lost = money - bet;
  var won = money + (bet * 2); 
  var dice;
  
  while (money > 0){
    bet = prompt("Your money is " + money + "\nEnter bet amount or cash out to leave");
    RollDice(dice);
    if (dice = 2 || 3 || 4 || 6 || 8 || 10 || 12){
      document.write("The dice was " + dice + ". You lost the bet.");
      document.write("Your money now equals " + lost);
      money -= lost;
    } else if (dice = 5 || 9 || 11){
      document.write("The dice was " + dice + ". It is a draw.");
      document.write("Your money is returned.");
    } else if (dice = 7){
      document.write("The dice was 7. You won!");
      document.write("Your money now equals " + won);
      money  += won;
    }
  }
}

function RollDice(dice) {
  return dice = Math.floor((Math.random() * 12) + 2); 
}