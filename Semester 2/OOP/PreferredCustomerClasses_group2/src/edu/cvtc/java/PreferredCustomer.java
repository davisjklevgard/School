package edu.cvtc.java;

public class PreferredCustomer /*extends Customer*/{
    //Attributes
    private double purchases;
    private double discountLevel;

    //Default
    public PreferredCustomer(){

    }

    //Overload
    public PreferredCustomer(String personName, String address, String phoneNumber, String customerNumber,
                             boolean mailingList, double purchases, double discountLevel){
        super(personName, address, phoneNumber, customerNumber, mailingList, purchases, discountLevel);
        setDiscountLevel(discountLevel);
        setPurchases(purchases);
    }

    //Methods

    public double getPurchases() {
        return purchases;
    }

    public void setPurchases(double purchases) {
        this.purchases = purchases;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        String retVal = "";

        retVal += super.toString();
        retVal += "Purchases: " + getPurchases() + "\n";
        retVal += "Discount Level: " + getDiscountLevel() + "\n";

        return retVal;
    }
}
