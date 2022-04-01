/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Cosine extends Taylor{
    public Cosine(int k,int x){
        super(k,x);
    }
    public double getApprox(){
        double ans=0;
        for(int i=0;i<super.getlteration();i++){
            ans+=(Math.pow(-1, i)*Math.pow(super.getValue(), 2*i))/super.factorial(2*i);
        }
        return ans;
    }
    public void printValue() {
        System.out.println("Value from Math.cos() is "+Math.cos(super.getValue())+"\nApproximated value is "+getApprox());
    }
}
