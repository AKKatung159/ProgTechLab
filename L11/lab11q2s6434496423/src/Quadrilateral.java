
import java.awt.Point;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public abstract class Quadrilateral {
    private Point a,b,c,d;
    private double[] dis;
    private Point[] p;
    public Quadrilateral(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        p=new Point[4];
        a=new Point(x1,y1);p[0]=a;
        b=new Point(x2,y2);p[1]=b;
        c=new Point(x3,y3);p[2]=c;
        d=new Point(x4,y4);p[3]=d;
        
    }
    public double[] getSortedDist(){
        dis =new double[6];
        int x=0;
        double num=0;
        for(int i=0;i<p.length;i++){
            for(int j=i;j<p.length-1;j++){
                dis[x]=p[i].distance(p[j+1]);
                x++;
            }
        }
        for(int j=0;j<dis.length;j++){
            for(int i=0;i<dis.length-1;i++){
            if(dis[i]>dis[i+1]){
                num=dis[i];
                dis[i]=dis[i+1];
                dis[i+1]=num;
            }
        }
        }
        return dis;
    }
    public String toString(){
        String ans="";
        for (Point p1 : p) {
            ans += "\n" + p1.getClass().getName() + "[x = " + p1.x + ", y = " + p1.y + "]";
        }
        return ans;
    }
    public abstract double area();
}
