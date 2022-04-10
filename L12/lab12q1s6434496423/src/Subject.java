/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Subject implements Evaluation{
    private String subjName;
    private int score[];
    public Subject(String sn,int[] s){
        subjName=sn;
        score=s;
    }
    public double evaluate(){
        int ans=0;
        for(int i=0;i<score.length;i++){
            ans+=score[i];
        }
        return ans/score.length;
    }
    public char grade(double score){
        char ans=' ';
        if(score>=70){
            ans='P';
        }
         if(score<70){
            ans='F';
        }
        return ans;
    }
    public String toString(){
        return subjName;
    }
}
