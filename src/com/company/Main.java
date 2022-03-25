package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println(circle1.getArea());

        circle1.setColor("Blue");
        circle1.setRadius(14.0);
        System.out.println("Circle1 sau khi set :" + circle1.toString());
        System.out.println("Area circle1: " + circle1.getArea());
    }
}
