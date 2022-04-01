/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Expo extends Taylor{
    public Expo(int k,double x){
        super(k,x);
    }
    public double getApprox(){
        double ans=0;
        for(int i=0;i<=super.getlteration();i++){
            ans+=Math.pow(super.getValue(), i)/super.factorial(i);
        }
        return ans;
    }
    public void printValue() {
        System.out.println("Value from Math.exp() is "+Math.exp(super.getValue())+"\nApproximated value is "+getApprox());
    }
}
