/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        File ipFile = new File("wordlist.txt");
        System.out.print("Enter a sentence : ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> word = new ArrayList<>();
        try{
            Scanner read = new Scanner(ipFile);
            while(read.hasNextLine()){
                word.add(read.nextLine());
            }
            read.close();
        }catch(Exception e){
            System.out.println(e);
        }
        String line = sc.nextLine();
        String[] wordip = line.split(" ");
        System.out.println("Word not contained : ");
        int check=0;
        String uncheck="";
        for(int i=0;i< wordip.length;i++){
            check=0;
           // System.out.println(wordip[i]);
            for(int j=0;j<word.size();j++){
                if(wordip[i].equals(word.get(j))){
                    check++;
                    //System.out.println(word.get(j));
                    break;
                }
            }
            if(check==0){
                uncheck+=wordip[i]+" ";
            }
        }
        if(uncheck.isEmpty()){
            System.out.println("N/A");
        }
        else{
            System.out.println(uncheck);
        }
    }
}
