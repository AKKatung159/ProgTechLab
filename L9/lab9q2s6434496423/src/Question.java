/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Question {
    private String text;
    private String answer;
    
    public Question(){
        
    }
    public Question(String t){
        text=t;
    }
    
    public void setText(String t){
        text=t;
    }
    
    public void setAnswer(String a){
        answer=a;
    }
    
    public String getText(){
        return text;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public boolean checkAnswer(String response){
        return (response.trim().equals(answer.trim()));
    }
    public void display(){
        System.out.println(text);
    }
}
