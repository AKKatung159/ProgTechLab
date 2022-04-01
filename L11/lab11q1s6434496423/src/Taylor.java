/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public abstract class Taylor {
    private int k;
    private double x;
    public Taylor(int ik,double ix){
        k=ik;
        x=ix;
    }
    public int factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        if(n==0){
            fac=1;
        }
        return fac;
    }
    public int getlteration(){
        return k;
    }
    public double getValue(){
        return x;    
    }
    public abstract void printValue();
    public abstract double getApprox();
}
