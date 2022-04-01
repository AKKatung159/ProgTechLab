/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name : ");
    String name = sc.nextLine();
    System.out.print("Enter age : ");
    int age = sc.nextInt();
    System.out.println(name+" was born in "+(2022-age)+".");
    }
}
