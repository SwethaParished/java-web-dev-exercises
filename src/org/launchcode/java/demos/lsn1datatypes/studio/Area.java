package org.launchcode.java.demos.lsn1datatypes.studio;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        while(radius <= 0){
            System.out.println("Enter the radius:");
            radius = input.nextDouble();
        }
        if(radius > 0) {
            double area = Circle.getArea(radius);
            System.out.println("Area of the Rectangle of radius " + radius + " is: " + area);
        }
    }
}
