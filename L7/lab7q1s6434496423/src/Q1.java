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
        System.out.print("Enter n : ");
        int n =sc.nextInt();
        Integer[] num = new Integer[n];
        int checknum=0;
        for (int i = 1;checknum<n;i++){
            int check=0;
            for (int j = 1;j<i;j++)if (i%j==0)check+=1;
        if(check==1){
            num[checknum]=i;
            checknum++;
        }
        }
        for (int i =0;i<num.length;i++)System.out.println(num[i]);
    }
}
