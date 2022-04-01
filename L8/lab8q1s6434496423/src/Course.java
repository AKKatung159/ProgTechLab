
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Course {
    private String subject,subject_id ;int credit;
    private static int numcourse=0;
    static ArrayList<numberOfFaccourses>numOfFac = new ArrayList<>();
    public Course(String ipsubject,String ipsubject_id){
        subject=ipsubject; subject_id=ipsubject_id;credit=3;
        numcourse+=1;
        boolean c = false;
         for (int i =0;i<numOfFac.size();i++){
            if(numOfFac.get(i).getfaccode()==Integer.parseInt(ipsubject_id.substring(0,2))){
                numOfFac.get(i).addnum();
                c = true;
            }
            
        }
        if (c == false){
            numberOfFaccourses n=new numberOfFaccourses(Integer.parseInt(ipsubject_id.substring(0,2)));        
            numOfFac.add(n); 
        }
    }

    public Course(String ipsubject,String ipsubject_id,int ipcredit){
        subject=ipsubject; subject_id=ipsubject_id;credit=ipcredit;
        numcourse+=1;
        boolean c = false;
         for (int i =0;i<numOfFac.size();i++){
            if(numOfFac.get(i).getfaccode()==Integer.parseInt(ipsubject_id.substring(0,2))){
                numOfFac.get(i).addnum();
                c = true;
            }
            
        }
        if (c == false){
            numberOfFaccourses n=new numberOfFaccourses(Integer.parseInt(ipsubject_id.substring(0,2))); 
            numOfFac.add(n); 
        }
    }
    public void setCid(String ipsubject_id){
        subject_id=ipsubject_id;
    }
    public void setCname(String ipsubject){
        subject=ipsubject;
    }
    public void setCredit(int ipcredit){
        credit=ipcredit;
    }
    public String getCid(){
        return subject_id;
    }
    public String getCname(){
        return subject;
    }
    public int getCredit(){
        return credit;
    }
    public int numberOfCourse(){
        return numcourse;
    }
    public int numberOfFacCourse(int faccode){
        int num = 0;
        for(int i=0;i<numOfFac.size();i++){
            if(numOfFac.get(i).getfaccode()==faccode){
                num = numOfFac.get(i).getnum();
            }
        }
        return num;
    }
    public boolean equals(Course that){
        return this.subject.equals(that.subject)&&this.subject_id.equals(that.subject_id)&&this.credit==that.credit;
    }
    public int compare(Course that){
        int x;
        if(this.subject.equals(that.subject)&&this.subject_id.equals(that.subject_id)&&this.credit==that.credit) x=0;
        else if(this.subject.equals(that.subject)&&this.credit==that.credit) x=1;
        else if(this.subject_id.equals(that.subject_id)&&this.credit==that.credit) x=2;
        else if(this.subject.equals(that.subject)&&this.subject_id.equals(that.subject_id)) x=3;
        else if(this.subject_id.equals(that.subject_id)) x=4;
        else if(this.subject.equals(that.subject)) x=5;
        else if(this.credit==that.credit) x=6;
        else x=7;
        return x;
    }
    public String toString(){     
        return subject_id+" "+subject+" "+credit;
    }
    public static ArrayList<numberOfFaccourses> getnumoffac(){
        return numOfFac;
    }
}
