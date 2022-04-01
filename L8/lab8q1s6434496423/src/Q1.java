/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course ID, name, credit : or x to stop");
        String Line = sc.nextLine();
        Course c = null;
        while(!Line.equals("X")){
            String[] line=Line.split(" ");
            String name="";
            for(int i =1;i<line.length-1;i++){
                name+=line[i]+" ";
            }
            c=new Course(name.trim(),line[0],Integer.parseInt(line[line.length-1]));
            Line = sc.nextLine();
        }
        
        System.out.println(c.numberOfCourse()+" course");
        for(int i=0;i<Course.getnumoffac().size();i++){
            System.out.println(c.numberOfFacCourse(Course.getnumoffac().get(i).getfaccode())+" courses for "+Course.getnumoffac().get(i).getfaccode());
        }
    }
}
