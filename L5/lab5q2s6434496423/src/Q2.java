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
        String subject,subject_id,subject_id2,subject2,subject3,subject_id3 ; int credit,credit3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course ID, course name, credit : ");
        subject_id=sc.next();
        subject=sc.next()+" "+sc.next();
        credit=sc.nextInt();
        Course c1 = new Course(subject,subject_id,credit);
        System.out.print("Enter course ID, course name : ");
        subject_id2=sc.next();
        subject2=sc.next()+" "+sc.next();
        Course c2 = new Course(subject2,subject_id2);
        if (c1.equals(c2)){
            System.out.println("Same course");
            System.out.print("Enter course ID, course name, credit : ");
            subject_id3=sc.next();
            subject3=sc.next()+" "+sc.next();
            credit3=sc.nextInt();
            c2.setCid(subject_id3); c2.setCname(subject3); c2.setCredit(credit3);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("Total credit : "+(c1.getCredit()+c2.getCredit()));
        }
        else{
            switch(c1.compare(c2)){
                case 1:System.out.println("Different course ID.");break;
                case 2:System.out.println("Different course name.");break;
                case 3:System.out.println("Different course credit.");break;
                case 4:System.out.println("Different course name and course credit.");break;
                case 5:System.out.println("Different course ID and course credit.");break;
                case 6:System.out.println("Different course name and course ID.");break;
                case 7:System.out.println("Different course name, course ID and course credit.");break;
            }
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("Total credit : "+(c1.getCredit()+c2.getCredit()));
        }
    }
}
