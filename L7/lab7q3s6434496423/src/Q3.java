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
        
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[3];
        Course[] course = new Course[5];
        
        System.out.println("Enter 3 Student ID and name :");
        for(int i=0;i<3;i++){
            String id = sc.next();
            String name = sc.nextLine().trim();
            stu[i]=new Student(name,id);
        }
  
        System.out.println("Enter 5 course ID,name and credit :");
        for(int i=0 ;i<5;i++){
        String line =sc.nextLine();
        String[] l=line.split(" ");
        String cid=l[0];
        String cname="";
        if(l.length==4){
            cname=l[1]+" "+l[2];
        }
        else if (l.length==5){
            cname=l[1]+" "+l[2]+" "+l[3];
        }
        int ccredit=Integer.parseInt(l[l.length-1]);
        course[i]=new Course(cname,cid,ccredit);
        }
        
        for(int i=0;i<3;i++){
            System.out.println(stu[i].getName()+" grade report : ");
            String info=sc.nextLine();
            while(!info.equals("X")){
                String[] cinfo=info.split(" ");
                for(int j=0;j<course.length;j++){
                    if(cinfo[0].equals(course[j].getCid())){
                        stu[i].addGradeReport(course[j], cinfo[1]);
                    }
                }
                info=sc.nextLine();
            }
        }
        for(int i =0;i<3;i++){
            System.out.println("-----Transcript-----");
            System.out.println("  "+stu[i].getID()+" "+stu[i].getName());
            System.out.println(stu[i].getctran());
            System.out.println("  GPA: "+stu[i].calGPA());
        }
    }
}