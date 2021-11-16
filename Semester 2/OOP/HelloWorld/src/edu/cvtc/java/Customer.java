package edu.cvtc.java;

public class Customer {

    //Attributes
    private String name;
    private String number;

    //Default Constructor
    public Customer(){
        setName("");
        setNumber("");
    }

    //Overload
    public Customer(String name, String number){
        setName(name);
        setNumber(number);
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isValidNumber(number)) {
            this.number = number;
        } else  {
            this.number = "Invalid Customer Number.";
        }
    }

    private boolean isValidNumber(String customerNumber){
        //local variables
        boolean isValid = true;
        int index = 0;

        //Check #1: Is it 7 characters
        if (customerNumber.length() != 7){
            isValid = false;
        }

        //Check #2: Is bucket 0 a letter?
        //Check #3: Is bucket 1 a letter?
        //Check #4: Is bucket 2 a letter?
        //Check to see if it is valid first and then increment the loop
        while (isValid && index < 3) {
            if(!Character.isUpperCase(customerNumber.charAt(index))){
                isValid = false;
            }else {
                if (!Character.isLetter(customerNumber.charAt(index))) {
                    isValid = false;
                }
            }
            index++;
        }

        //Check #5: Is bucket 3 a digit?
        //Check #6: Is bucket 4 a digit?
        //Check #7: Is bucket 5 a digit?
        //Check #8: Is bucket 6 a digit?
        while (isValid && index < 7) {
            if(!Character.isDigit(customerNumber.charAt(index))) {
                isValid = false;
            }
            index++;
        }


        return isValid;
    }

    @Override
    public String toString() {
        String retVal = "";

//        retVal = "Name: " + getName() + "\n";
//        retVal = retVal + "Number: " + getNumber() + "\n";

        retVal = "Name: " + getName() + "\n";
        retVal +=   "Number: " + getNumber() + "\n";

        return retVal;
    }
}
