/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Car {
    private double gas;
    private double effciency;
    
    public Car(){
        gas=0;
        effciency=0;
    }
    public Car(double g,double e){
        gas=g;
        effciency=e;
    }
    public void drive(double distance){
        if(gas*effciency>distance){
            gas-=(distance/effciency);
        }
        else{
            System.out.println("You cannot drive too far,please add gas.");
        }
    }
    public void setGas(double amount){
        gas=amount;
    }
    public double getGas(){
        return gas;
    }
    public double getEffciency(){
        return effciency;
    }
    public void addGas(double amount){
        gas+=amount;
    }
}
