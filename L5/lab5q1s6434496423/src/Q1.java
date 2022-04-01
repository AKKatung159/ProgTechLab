/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to sum three integers.");
        System.out.println("Press 2 to find roots of a quadratic equation.");
        System.out.println("Press 3 to find the area of a rectangle.");
        System.out.println("Press 4 to print A's.");
        int check = sc.nextInt();
        if(0 < check && check < 5) {
            switch(check){
                case 1:{
                    System.out.println("Enter 3 integers : ");
                    System.out.println("Sum : "+(sc.nextInt()+sc.nextInt()+sc.nextInt()));
                    break;
                }
                case 2:{
                    System.out.println("Enter a, b, c for ax^2+bx+c=0 : " );
                    double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
                    double num = (-b+(Math.sqrt(b*b-4*a*c)))/(2*a);
                    System.out.println("Two roots : "+num+", "+(-num));
                    break;
                }
                case 3:{
                    System.out.println("Enter lenght of 2 sides of the rectangle : ");
                    System.out.println("Area : "+(sc.nextDouble()*sc.nextDouble()));
                    break;
                }
                case 4:{
                    System.out.println("How many A's ?");
                    System.out.println("A".repeat(sc.nextInt()));
                    break;
                }
            }
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
