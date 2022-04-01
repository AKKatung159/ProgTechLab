
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Test {
    public static void main(String[] args) {
        Expo exp=new Expo(7,1);
        exp.printValue();
        Sine s =new Sine(7,Math.PI/4);
        s.printValue();
        Cosine cs =new Cosine(7,1);
        cs.printValue();
        System.out.println("\n");
        Taylor[] a=new Taylor[3];
        a[0]=(new Expo(7,1));      
        a[1]=(new Sine(7,Math.PI/4));
        a[2]=(new Cosine(7,1));
        for(int i=0;i<a.length;i++){
            a[i].printValue();
        }
    }
}
