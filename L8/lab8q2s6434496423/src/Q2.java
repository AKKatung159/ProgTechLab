/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */

public class Q2 {
    public static void main(String[] args) {
        
        System.out.println("A =");
        
        Mtx A = new Mtx(Mtx.genmtx(10, 5));
        System.out.println(A.showMtx());
        
        System.out.println("\nB =");
        Mtx B = new Mtx(Mtx.genmtx(10, 5));
        System.out.println(B.showMtx());
        
        System.out.println("\nC =");
        Mtx C = new Mtx(Mtx.genmtx(5, 3));
        System.out.println(C.showMtx());
        
        System.out.println("\nA+B =");
        System.out.println(Mtx.showMtx(A.add(B)));
        
        int num=2;
        System.out.println(num+"*B =");
        System.out.println(Mtx.showMtx(B.mul(num)));
        
        
        if(A.compatible(B)){
            System.out.println("A*C =");
            System.out.println(Mtx.showMtx(A.mul(B)));
        }
        else{
            System.out.println("A and B are not compatible\n");
        }
        
        if(A.compatible(C)){
            System.out.println("A*C =");
            System.out.println(Mtx.showMtx(A.mul(C)));
        }
        else{
            System.out.println("A and C are not compatible\n");
        }
    }
}
