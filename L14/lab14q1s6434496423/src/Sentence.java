/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Sentence {
    private String s;
    private static int check=0;
    public Sentence(String s){
        this.s=s;
    }
    public boolean find(String sf){
        return find(sf,0,sf.length());
    }
    public boolean find(String sf,int start,int stop){
        String word=s.substring(start, stop);
        if(sf.equals(word)){
            return true;
        }
        else if(stop+1<=s.length()){
            return find(sf,start+1,stop+1);
        }
        else{
            return false;
        }
    }
}
