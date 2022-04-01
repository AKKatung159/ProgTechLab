/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;
    
    public ChoiceQuestion(){
        
    }
    public ChoiceQuestion(String t){
        choices=new ArrayList<>();
        super.setText(t);
    }
    public void addChoice(String choice,boolean correct){
        if(correct){
            choices.add(choice);
            super.setAnswer(choice);
        }
        else{
            choices.add(choice);
        }
    }
    public void display(){
        System.out.println(super.getText());
        for(int i=0;i<choices.size();i++){
            System.out.println((i+1)+": "+choices.get(i));
        }
    }
    public boolean checkAnswer(String response){
        int i =Integer.valueOf(response);
        return choices.get(i-1).equals(super.getAnswer());
    }
}
