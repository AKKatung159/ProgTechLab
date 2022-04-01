/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Student 1 : Enter ID, birthday, name : ");
        String id1 = sc.next();
        int date1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();
        String name1 = sc.nextLine();
        Student st1 = new Student(name1,id1,date1,month1,year1);
        System.out.print("Student 2 : Enter ID, name : ");
        String id2 = sc.next();
        String name2 = sc.nextLine();
        Student st2 = new Student(name2,id2);
        
        System.out.println("Student 1 : "+st1.getID()+" "+st1.getName()+" "+st1.getAge());
        System.out.println("Student 2 : "+st2.getID()+" "+st2.getName()+" "+st2.getAge());
        if (st1.getName().equals(st2.getName()) && st1.getID().equals(st2.getID()) && st1.getAge()==st2.getAge()) {
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        
        System.out.print("Enter birthday for Student 2 : ");
        int date2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();
        st2.setBD(date2,month2,year2);
        
        System.out.println("Student 1 : "+st1.getID()+" "+st1.getName()+" "+st1.getAge());
        System.out.println("Student 2 : "+st2.getID()+" "+st2.getName()+" "+st2.getAge());
        if (st1.getName().equals(st2.getName()) && st1.getID().equals(st2.getID()) && st1.getAge()==st2.getAge() ){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}