/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class FindRecursive {
    public static void main(String[] args) {
        Sentence s= new Sentence("Prog Tech");
        boolean b =s.find("Te");
        if(b){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
