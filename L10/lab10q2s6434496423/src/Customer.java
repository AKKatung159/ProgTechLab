/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Customer {
    private String name,tel;
    
    public Customer(String n,String t){
        name=n;
        tel=t;
    }
     public String toString(){
        return name+" tel : "+tel;
    }
}
