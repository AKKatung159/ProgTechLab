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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        String[] line = sc.nextLine().split(" ");
        int ans = 0,a=Integer.parseInt(line[0]),b=Integer.parseInt(line[1]),c=Integer.parseInt(line[2]);
        for (int i=a; i<=b; i++) {
        for (int j=i; j<=(c*i);j++){
            ans+=(i*i+j);
        }
    }
        System.out.println("Answer = "+ans);
    }
}
