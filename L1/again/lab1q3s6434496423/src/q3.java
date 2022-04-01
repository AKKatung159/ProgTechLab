/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 ,num2;
        System.out.print("Enter a number : ");
        num1=input.nextDouble();
        System.out.print("Enter another number : ");
        num2=input.nextDouble();
        System.out.println("The ratio between their product and their sum is "+(num1*num2)/(num1+num2));
    }
}
