/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class QuadrilateralTester {
    public static void main(String[] args) {
        Square a1=new Square(0,0,2,2,0,2,2,0);
        System.out.println(a1.toString());
        System.out.println("Area of Square = "+a1.area());
        a1.getSortedDist();
        
        Square a2=new Square(2,2,0,2,0,0,2,0);
        System.out.println(a2.toString());
        System.out.println("Area of Square = "+a2.area());
        
        Rectangle b1=new Rectangle(2,5,0,5,0,0,2,0);
        System.out.println(b1.toString());
        System.out.println("Area of rectangle = "+b1.area());
        
        Kite c1=new Kite(0,0,1,0,0,1,4,4);
        System.out.println(c1.toString());
        System.out.println("Area of kite = "+c1.area());       
    }
}
