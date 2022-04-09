/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class CNGBus extends Bus implements LiquidFuel{
    private double range;
    private int emissionTier;
    public CNGBus(double r,int e,int cp,double c){
        super(cp,c);
        range=r;
        emissionTier=e;
    }
    public double getAccel(){
        return 3.0;
    }
    public double getRange(){
        return range;
    }
    public int getEmissionTier(){
        return emissionTier;
    }
}
