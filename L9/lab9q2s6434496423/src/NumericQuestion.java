/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class NumericQuestion extends Question{
    public NumericQuestion(){
        
    }
    public NumericQuestion(String t){
        super.setText(t);
    }
    public boolean checkAnswer(String response){
        return Double.valueOf(super.getAnswer())-Double.valueOf(response)<0.01;
    }
}
