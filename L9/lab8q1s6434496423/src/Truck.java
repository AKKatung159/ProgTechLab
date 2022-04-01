/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Truck extends Car{
    private double M_weight;
    private double weight;
    
    public Truck(){
        
    }
    public Truck(double g,double e,double mw,double w){
        super(g,e);
        if(mw<w){
            weight=mw;
            M_weight=mw;
        }
        else{
            M_weight=mw;
            weight=w;
        }
       
    }
    public void drive(double distance){
        if(weight<1){
            super.drive(distance);
        }
        else if(weight>1 && weight<10){
            super.drive(distance*1.1);
        }
        else if(weight>10 && weight<20){
            super.drive(distance*1.2);
        }else {
            super.drive(distance*1.3);
        }
    }
    
}
