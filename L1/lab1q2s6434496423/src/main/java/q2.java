/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name : ");
        String nameus = input.nextLine();
        System.out.println("Enter birth year : ");
        int agein = input.nextInt();
        int age = 2565 - agein ;
        System.out.println(nameus+" is "+age+" years old.");
    }
}
