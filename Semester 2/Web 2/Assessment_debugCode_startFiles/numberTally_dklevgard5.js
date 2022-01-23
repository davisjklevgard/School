function numberTally(numList) {
	
	var evenTotal = 0;
	var oddTotal = 0;

	for (var i = 0; i < numList.length; i++) {

		if (i % 2) {  // i is odd

			oddTotal += numList[i];
			// or oddTotal = oddTotal + numList[i];
			
		} else {  // i is even

			evenTotal += numList[i];
			
		}

	}

	alert(oddTotal);
	return evenTotal;

}  // end function numberTally