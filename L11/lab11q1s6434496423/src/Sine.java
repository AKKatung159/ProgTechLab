/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Sine extends Taylor{
    public Sine(int k,double x){
        super(k,x);
    }
    public double getApprox(){
        double ans=0;
        for(int i=0;i<=super.getlteration();i++){
            ans+=(Math.pow(-1,i)*Math.pow(super.getValue(), 2*i+1))/super.factorial(2*i+1);
        }
        return ans;
    }
    public void printValue() {
        System.out.println("Value from Math.sine() is "+Math.sin(super.getValue())+"\nApproximated value is "+getApprox());
    }
}
