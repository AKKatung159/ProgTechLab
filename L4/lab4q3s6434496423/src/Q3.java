/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Point A : ");
        Point p1 =new Point(sc.nextFloat(),sc.nextFloat());
        System.out.print("Point B : ");
        float xp2=sc.nextFloat(); float yp2=sc.nextFloat();
        Point p2 =new Point(xp2,yp2);
        System.out.println("A = "+p1+"  B = "+p2+"  Distance = "+p1.distance(p2));
        System.out.print("Move the point : ");
        float xmove=sc.nextFloat(); float ymove=sc.nextFloat();
        p1.translate(xmove, ymove); p2.translate(xmove, ymove);
        System.out.println("A = "+p1+"  B = "+p2+"  Distance = "+p1.distance(p2));
        String check = p1.equals(p2) ? "A and B are at the same position.":"A and B are not at the same position.";
        System.out.println(check);
    }
}
