/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Employee {
    private String name;
    private int salary;
    public Employee(String n,int s){
        name=n;
        salary=s;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String toString(){
        return name+"\nsalary = "+salary;
    }
}
