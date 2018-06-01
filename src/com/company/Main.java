package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // calling a method namer Rain
        Rain();

    }

    public static void Rain() {

        Scanner keyboard = new Scanner(System.in);
        double roofLength, roofWidth, inchRainfall, runOff;


        System.out.print("Enter Length: ");
        roofLength = keyboard.nextDouble();
        System.out.print("Enter Width: ");
        roofWidth = keyboard.nextDouble();
        System.out.print("Enter rainfall in Inches: : ");
        inchRainfall = keyboard.nextDouble();

        //Calculations
        roofLength = roofLength * 12;
        roofWidth = roofWidth * 12;
        runOff = (roofLength * roofWidth * inchRainfall) / 231;
        System.out.print(runOff + " Cubic galloon: ");

    }
}
