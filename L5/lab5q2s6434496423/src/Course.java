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
    public Course(String ipsubject,String ipsubject_id){
        subject=ipsubject; subject_id=ipsubject_id;credit=3;
    }
    public Course(String ipsubject,String ipsubject_id,int ipcredit){
        subject=ipsubject; subject_id=ipsubject_id;credit=ipcredit;
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
}
