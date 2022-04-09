/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Hybrid extends Bus implements LiquidFuel,Electric{
    private double voltage;
    private double range;
    private int emission;
    public Hybrid(double r,int e,double voltage,int cp,double c){
        super(cp,c);
        if(voltage<Electric.LOW_VOLTAGE){
            voltage = Electric.LOW_VOLTAGE;
        }
        else if(voltage>Electric.HIGH_VOLTAGE){
            voltage = Electric.HIGH_VOLTAGE;
        }
        else this.voltage=voltage;
        range=r;
        emission=e;
    }
    public double getAccel(){
        return 4.0;
    }
    public double getRange(){
        return range;
    }
    public int getEmissionTier(){
        return emission;
    }
    public double getVoltage(){
        return voltage;
    }
}
