package com.stayready.assessment1.part3;

import org.junit.Assert;
import org.junit.Test;

public class CuttingBoardTest {
    private static final double DELTA = 0.01;

    @Test
    public void testGetPrice(){
        double price = 10.99;
        CuttingBoard cuttingBoard = new CuttingBoard(price);

        Assert.assertEquals(price, cuttingBoard.getPrice(), DELTA);
    }

    @Test
    public void testGetDescription(){
        CuttingBoard board = new CuttingBoard(19.99);

        String expectedDescription = "This cutting board costs $19.99";
        Assert.assertEquals(expectedDescription, board.getDescription());
    }

    @Test
    public void testGetDescription_differentPrice(){
        CuttingBoard board = new CuttingBoard(21.88);

        String expectedDescription = "This cutting board costs $21.88";
        Assert.assertEquals(expectedDescription, board.getDescription());
    }

}
