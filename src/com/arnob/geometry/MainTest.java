package com.arnob.geometry;

public class MainTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println();
        Circle c2 =new Circle(2.0);
        System.out.println();
        Circle c3 = new Circle("red", true ,3.0);
        System.out.println();

        Rectangle r1 = new Rectangle();
        System.out.println();
        Rectangle r2 = new Rectangle(3.0 ,6.0);
        System.out.println();
        Rectangle r3 = new Rectangle("blue", false,4.0,7.0 );
        System.out.println();
    }
}
