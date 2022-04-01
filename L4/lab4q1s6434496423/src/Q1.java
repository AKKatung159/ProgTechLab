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
        double x1 ,x2 ,x3 ,x4 ,y1,y2,y3,y4;
        System.out.print("First point : ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.print("Second point : ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        System.out.print("Third point : ");
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        System.out.print("Fourth point : ");
        x4 = sc.nextDouble();
        y4 = sc.nextDouble();
        double centx = (x1+x2+x3+x4)/4.;
        double centy = (y1+y2+y3+y4)/4.;
        var dis1= Math.sqrt(((centx-x1)*(centx-x1)+(centy-y1)*(centy-y1)));
        var dis2= Math.sqrt(((centx-x2)*(centx-x2)+(centy-y2)*(centy-y2)));
        var dis3= Math.sqrt(((centx-x3)*(centx-x3)+(centy-y3)*(centy-y3)));
        var dis4= Math.sqrt(((centx-x4)*(centx-x4)+(centy-y4)*(centy-y4)));
        System.out.println("The centroid is ("+centx+", "+centy+" )");
        System.out.println("Sum of distance is "+(dis1+dis2+dis3+dis4));
        System.out.println("Shortest distance is  "+Math.min(Math.min(dis1, dis2),Math.min(dis3,dis4)));
        System.out.println("Longest distance is "+Math.max(Math.max(dis1, dis2),Math.max(dis3,dis4)));
    }
}