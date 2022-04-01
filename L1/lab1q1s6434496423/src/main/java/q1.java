/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name_age="";
        System.out.print("Enter name : ");
        name_age+=input.nextLine()+" is ";
        System.out.print("Enter age : ");
        name_age+=input.nextLine()+" years old. ";
        System.out.println(name_age);
    }
}
*/
import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          String name=input.next();
          System.out.println("hello "+name);
    }
}