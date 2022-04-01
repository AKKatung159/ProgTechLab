
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Mtx {
    private int[][] mtx;
    public Mtx(int[][] ipmtx){
        mtx=ipmtx;
    }
    public boolean equalSize(Mtx that){
        return this.getsize().equals(that.getsize());
    }
    public boolean compatible(Mtx that){
        return this.getmtx()[0].length==that.getmtx().length;
    }
    public int[][] add(Mtx that){
        int[][] a = new int[mtx.length][mtx[0].length];
        for(int i=0;i<mtx.length;i++){
            for(int j=0;j<mtx[0].length;j++){
            a[i][j]=this.getmtx()[i][j]+that.getmtx()[i][j];
            }
        }      
        return a;
    } 
    public String getsize(){
        return mtx.length+" "+mtx[0].length;
    }
    public int[][] getmtx(){
        return mtx;
    }
    public int[][] mul(Mtx that){
        int[][] a = new int[mtx.length][that.getmtx()[0].length];
        for(int i=0;i<mtx.length;i++){
            for(int j=0;j<that.getmtx()[0].length;j++){
                a[i][j]=0;
                for(int k=0;k<that.getmtx().length;k++){
                    a[i][j]+=this.getmtx()[i][k]*that.getmtx()[k][j];
            }
                }
        }      
        return a;
    }
    public int[][] mul(int n){
        int[][] a = new int[mtx.length][mtx[0].length];
        for(int i=0;i<mtx.length;i++){
            for(int j=0;j<mtx[0].length;j++){
            a[i][j]=this.getmtx()[i][j]*n;
            }
        }      
        return a;
    }
    public String showMtx(){
        String show = "";
        for(int[] x:mtx){
            for(int y:x){
                show+=(y+"\t");
            }
            show+=("\n");
        }
        return show;
    }
    public static String showMtx(int[][] a){
        String show = "";
        for(int[] x:a){
            for(int y:x){
                show+=(y+"\t");
            }
            show+=("\n");
        }
        return show;
    }

    public static int[][] genmtx(int row,int column){
        Random rand=new Random();
        int[][] a = new int[row][column];
        for (int i =0;i<row;i++){
            for (int j=0;j<column;j++){
                a[i][j]=rand.nextInt(-100, 100);
            }
        }
        return a;
    }
    
}
