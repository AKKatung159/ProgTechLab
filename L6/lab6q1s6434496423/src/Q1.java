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
        String Line,Cg;
        int Cd,sumcd=0,sumg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course ID, credit and grade; or x to terminate");
        Line = sc.nextLine();
        while (!Line.equals("x")){
            String[] line = Line.split(" ");
            sumcd+=Integer.parseInt(line[1]);
            switch (line[2]) {
                case "A":sumg+=(4*Integer.parseInt(line[1])) ;break;
                case "B+":sumg+=(3.5*Integer.parseInt(line[1])) ;break;
                case "B":sumg+=(3*Integer.parseInt(line[1])) ;break;
                case "C+":sumg+=(2.5*Integer.parseInt(line[1])) ;break;
                case "C":sumg+=(2*Integer.parseInt(line[1])) ;break;
                case "D+":sumg+=(1.5*Integer.parseInt(line[1])) ;break;
                case "D":sumg+=(1*Integer.parseInt(line[1])) ;break;
                case "F":sumg+=(0*Integer.parseInt(line[1])) ;break;
            }
            Line = sc.nextLine();
        }
        System.out.println("GPA = "+(double)sumg/sumcd);
    }
}
