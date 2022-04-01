/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Point {
    private float x,y;
    public Point(float xip,float yip){
        x=xip;y=yip;
    }
    public double distance(Point p){
        return Math.sqrt(((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)));
    }
    public void translate(float xip,float yip){
        x+=xip;y+=yip;
    }
    public boolean equals(Point that){
        return (this.x==that.x&&this.y==that.y);
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
