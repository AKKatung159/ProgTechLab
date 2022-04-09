/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Secretary extends Employee implements Evaluation{
    private int typingSpeed;
    private int[] score;
    public Secretary(String name,int salary,int[] score,int ts){
        super(name,salary);
        this.score=score;
        typingSpeed=ts;
    }
    public double evaluate(){
        int ans=0;
        for(int i=0;i<score.length;i++){
            ans+=score[i];
        }
        return ans;
    }
    public char grade(double score){
        char ans=' ';
        if(score>=90){
            super.setSalary(18000);
            ans='P';
        }
         if(score<90){
            ans='F';
        }
        return ans;
    }
}
