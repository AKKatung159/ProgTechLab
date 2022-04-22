/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Scanner;
import java.io.*;

public class Q1 {
    public static void main(String[] args) throws Exception{
        int charCnt = 0;
        int wordCnt = 0;
        int lineCnt = 0 ;
        //File opFile = new File("text.txt");
        Scanner sc =new Scanner(System.in);
        PrintWriter op = new PrintWriter("text.txt");
        String l = sc.nextLine();
        while(!l.equals("quit")){
            op.println(l);
            charCnt+=l.length();
            lineCnt++;
            for(int i=0;i<l.length();i++){
                if(l.charAt(i)==' '){
                   wordCnt++;
                }
            }
            l = sc.nextLine();
        }
        op.close();
        System.out.println("Total characters : "+ charCnt);
        System.out.println("Total words : "+ (wordCnt+lineCnt));
        System.out.println("Total lines : "+ lineCnt);
    }   
}
