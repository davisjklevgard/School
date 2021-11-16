package edu.cvtc.java;

public class Stock {

    // Attributes
    private String symbol;
    private double sharePrice;

    // Overloaded Constructor
    public Stock(String symbol, double sharePrice) {
        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }

    // Methods
    public double getSharePrice() {
        return sharePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        String retVal = "";

        retVal += "Trading Symbol: " + getSymbol();
        retVal += "\nShare Price: " + getSharePrice();

        return retVal;
    }

    //  @Override
    public boolean equals(Stock stock) {
        boolean status = false;

        if (this.getSharePrice() == stock.getSharePrice() &&
                this.getSymbol().equals(stock.getSymbol())) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }

    // Create a new object and initialize it with the
    // same data held by the calling object.
    // Then, return a reference to the new object.
    public Stock copy() {
        Stock copyObject = new Stock(getSymbol(), getSharePrice());

        return copyObject;

    }
}

