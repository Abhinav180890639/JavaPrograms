package com.abhinav;

public class Book {

    private int noOfCopies;
    public static void main(String[] args) {
        Book ArtOfComputerProgramming = new Book();
        Book EffectiveJava = new Book();
        Book CleanCode = new Book();

        ArtOfComputerProgramming.noOfCopies = 100;
        EffectiveJava.noOfCopies = 50;
        CleanCode.noOfCopies = 45;
    }

}
