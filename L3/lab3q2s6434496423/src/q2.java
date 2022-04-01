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
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("positive num : ");
        do{
             n = sc.nextInt();
        }while (n<=0);
        System.out.println(n);
}
}