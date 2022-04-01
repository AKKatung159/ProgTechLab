
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Q4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check,check2,check3;
        System.out.println("Student 1 : Enter ID, name : ");
        String id1 = sc.next();
        String name1 = sc.nextLine();
        Student st1 = new Student(name1,id1);
        System.out.println("Student 2 : Enter ID, name : ");
        String id2 = sc.next();
        String name2 = sc.nextLine();
        Student st2 = new Student(name2,id2);
        if (st1.sameYear(st2)) check="Same"; else check="Different";
        if (st1.sameLevel(st2)) check2="same"; else check2="different";
        if (st1.sameFaculty(st2)) check3="same"; else check3="different";
        System.out.println(check+" year, "+check2+" level, "+check3+" faculty");
    }
}