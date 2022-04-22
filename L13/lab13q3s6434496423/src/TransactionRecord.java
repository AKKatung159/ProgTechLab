/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class TransactionRecord {
    private int acctNo;
    private double amount;
    public TransactionRecord(int ac,double am){
        acctNo=ac;
        amount=am;
    }
    public int getacctNo(){
        return acctNo;
    }
    public double getAmount(){
        return amount;
    }
    public void setacctNo(int a){
        acctNo=a;
    }
    public void setAmount(double a){
        amount=a;
    }
}
