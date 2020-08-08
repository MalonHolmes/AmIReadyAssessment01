package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CuttingBoardTest`
 * Make sure all the test pass.
 *
 * A CuttingBoard implements Product
 */
public class CuttingBoard {
    private String name;
    private double cost;
    /**
     * FIELDS
     *
     * A cutting board has two instance fields:
     *  - price is a double
     */


    /*
     * CONSTRUCTOR
     *
     * Create 1 constructor that takes a "price". Set the instance price field
     * to the parameter price.
     *
     */
    CuttingBoard(double price) {
        this.cost = price;
    }

    CuttingBoard(double price, String name) {
        this.cost = price;
        this.name = name;
    }



    /*
     * METHODS
     *
     * 1. Create a getter method called "getPrice" to return the price.
     *    The return type is double.
     *
     * 2. Create a method called "getDescription()". It returns a
     *  String description of the object.
     *      It should be formatted like this:
     *      "This cutting board costs $[price]"
     *      Example: "This cutting board costs $19.99"
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        String info = "This cutting board costs S" + this.getPrice();
    }

}
