/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class AccountRecord {
    private int acctNo;
    private String name;
    private double balance;
    private int transCnt =0;
    public AccountRecord(int acctNo,String name,double balance){
        this.acctNo=acctNo;
        this.name=name;
        this.balance=balance;
    }
    public void combine(TransactionRecord t){
        if(acctNo==t.getacctNo()){
            balance+=t.getAmount();
            transCnt++;   
        }
    }
    public int getAcctNo(){
        return acctNo;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public int getTransCnt(){
        return transCnt;
    }
}
