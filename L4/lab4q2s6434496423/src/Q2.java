/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fname ,lname,age;
        System.out.print("Enter firstname lastnaem age : ");
        String ip = sc.nextLine();
        fname = ip.substring(0,ip.indexOf(' '));
        ip=ip.substring(ip.indexOf(' '),ip.length()).trim();
        lname = ip.substring(0,ip.indexOf(' '));
        ip=ip.substring(ip.indexOf(' '),ip.length()).trim();
        age = ip.trim();
        System.out.println(lname+", "+fname+" is "+age+" years old.");
        
    }
}
