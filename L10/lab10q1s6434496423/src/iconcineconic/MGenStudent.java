package iconcineconic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class MGenStudent extends MGenCard{
    private double discount=20;
    public MGenStudent(String name) {
        super(name);
    }
    public String toString(){
        return super.toString();
    }
    public void buyTicket(Cinema c,int num){
        super.buyTicket(c, num);
        int price= c.getTicketPrice()*num;
        System.out.println("You got "+price*discount/100+" discount");
    }
}
