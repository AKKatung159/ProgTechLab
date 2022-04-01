
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class Order {
    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p;
    public Order(Customer cu){
        c=cu;
        cntOrder++;
        id=cntOrder;
        p = new ArrayList<>();
    }
    public void addPizza(Pizza pi){
        p.add(pi);
    }
    public String getOrderDetail(){
        String pi="";
        for(int i=0;i<p.size();i++){
            pi+=p.get(i)+"\n";
        }
        return "Order id : "+id+"\n"+c+"\n"+pi+"Total piece : "+(p.size())+"\nTotal cost : "+calculatePayment();
    }
    public double calculatePayment(){
        double cal=0;
        for(int i=0;i<p.size();i++){
            cal+=p.get(i).getPrice();
        }
        if(c instanceof GoldCustomer){
            cal*=((100-((GoldCustomer)c).getDiscount())/100);
        }
        return cal;
    }
}