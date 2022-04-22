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

public class FileMatch {
    public static void main(String[] args) {
        ArrayList<AccountRecord> acList = new ArrayList<>();
        ArrayList<TransactionRecord> trList = new ArrayList<>();
        try(Scanner readAc = new Scanner(new File("master.txt"))){
            while(readAc.hasNextLine()){
                acList.add(new AccountRecord(readAc.nextInt(),readAc.next()+" "+readAc.next(),readAc.nextDouble()));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        try(Scanner readTr = new Scanner(new File("trans.txt"))){
            while(readTr.hasNextLine()){
                trList.add(new TransactionRecord(readTr.nextInt(),readTr.nextDouble()));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        for (int i = 0; i < acList.size(); i++) {
            for (int j = 0; j < trList.size(); j++) {
                acList.get(i).combine(trList.get(j));
            }
        }try(RandomAccessFile write = new RandomAccessFile("newMaster.dat","rw")){
            int accnt=0;
            double bal=0;
            int notr=0;
            for (int i = 0; i < acList.size(); i++) {
            write.writeInt(acList.get(i).getAcctNo());
            accnt++;
            write.writeChars(acList.get(i).getName()+(" ".repeat(30-acList.get(i).getName().length())));
            write.writeDouble(acList.get(i).getBalance());
            bal+=acList.get(i).getBalance();
            write.writeInt(acList.get(i).getTransCnt());
            if(acList.get(i).getTransCnt()==0){
                notr++;
            }
        }
            System.out.println("Total Account Record : "+accnt);
            System.out.println("Total Balance : "+bal);
            System.out.println("No transaction : "+notr+" account.");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
