/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Pizza {
    private String name;
    private double price;
    
    public Pizza(String n,double p){
        name=n;
        price=p;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return name+" price : "+price;
    }
}
