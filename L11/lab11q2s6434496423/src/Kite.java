/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Kite extends Quadrilateral{
    public Kite(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
     public double area(){
        double a=0;
        a=(super.getSortedDist()[2]*super.getSortedDist()[5])/2;
        return a;
    }
}
