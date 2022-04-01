/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 * 
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private String name,stuid;
    private int date , month ,year, day;
    private GregorianCalendar gca,gip;
    //
    private ArrayList<CourseGrade> transcript= new ArrayList();
    private CourseGrade x;
    public void addGradeReport(Course c, String g){
          x = new CourseGrade(c,g);
        transcript.add(x);
    }
    public double calGPA(){
        double sumcg=0;
        double sumc=0;
        for(int i=0;i<transcript.size();i++){
            sumcg+=transcript.get(i).getcg();
            sumc+=transcript.get(i).getc();
        }
        return sumcg/sumc;
    }
    public String getctran(){
        String statusc="";
        for(int i =0;i<transcript.size();i++){
            statusc+=transcript.get(i).toString()+"\n";
        }
        return statusc.trim();
    }
    //
    public Student(String ipname,String ipstuid){
        gca = new GregorianCalendar();
        name=ipname; stuid=ipstuid; date=gca.get(Calendar.DATE); month=gca.get(Calendar.MONTH); year=gca.get(Calendar.YEAR);
    }
    public Student(String ipname,String ipstuid,int ipdate ,int ipmonth ,int ipyear){
        gip = new GregorianCalendar(ipyear,ipmonth,ipdate);
        name=ipname; stuid=ipstuid; date=gip.get(Calendar.DATE); month=gip.get(Calendar.MONTH); year=gip.get(Calendar.YEAR);
    }
    public void setBD(int ipdate,int ipmonth,int ipyear){
    date=ipdate; month=ipmonth; year=ipyear;
    }
    public void setName(String ipname){
    name = ipname;
    }
    public String getBD(){
        return gca.get(Calendar.DATE)+" "+gca.get(Calendar.MONTH)+", "+gca.get(Calendar.YEAR);
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return stuid;
    }
    public int getAge(){
        gca = new GregorianCalendar();
        int age=((gca.get(Calendar.YEAR))-year);
        return age;
    }
    public int daysToYears(int ipday){
        return ipday/365;
    }
    public boolean equals(Student that) {
        return ((this.name).equals(that.name)) && ((this.stuid).equals(that.stuid)) && this.date == that.date && this.month == that.month && this.year == that.year ;
    }
    public String toString() {
        return
                "name = " + name +" "+
                "stuid = " + stuid +" "+
                "date = " + date +" "+
                "month = " + month +" "+
                "year = " + year +" ";
    }
}