/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class CourseGrade {
    private Course course;
    private double grade;
    private String gs;
    public CourseGrade(Course c, String g){
        gs=g;
         switch(g){
            case "A":grade=4;break;
            case "B+":grade=3.5;break;
            case "B":grade=3;break;
            case "C+":grade=2.5;break;
            case "C":grade=2;break;
            case "D+":grade=1.5;break;
            case "D":grade=1;break;
            case "F":grade=0;break;
    }
       course=c;
       
    }
    public double getcg(){
        return course.getCredit()*grade;
    }
    public double getc(){
        return course.getCredit();
    }
    public String toString(){
        return (course.getCid()+" "+course.getCname()+" "+course.getCredit()+" "+gs);
    }
}
