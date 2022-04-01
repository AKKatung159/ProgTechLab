package iconcineconic;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class IconCineconic {
    public static void main(String[] args) {
        //สร้างโรงภาพยนต์ 3 โรง
        Cinema c1 = new Cinema("Cinema",250);
        Cinema c2 = new Cinema("IMAX",350);
        Cinema c3 = new Cinema("4DX",450);
        
        // จงเติมคําสั่งสร้าง array list ชื่อ cardAL ให้เก็บ object ของ MGenCard
        ArrayList<MGenCard> cardAL =new ArrayList<>();
        
        cardAL.add(new MGenCard("Sasipa"));
        
        cardAL.add(new MGenFirstClass("Monnat"));
        
        cardAL.add(new MGenStudent("Mike"));
        //จงเติมคําสั่งเพื่อสั่งพิมพ์แสดงค่าของ memberFee ของ MGenStudent
        
        // ครูใส่บรรทัด พิมพ์ว่า Test run : ให้ เพื่อบอกสถานการณ์ของการรันแต่ละอัน
        System.out.println("Test run : Sasipa buys ticket(s) at cinema");
        cardAL.get(0).buyTicket(c1, 2);
        
        System.out.println("Test run : Sasipa buys ticket(s) at 4DX");
        cardAL.get(0).buyTicket(c3, 2);
        
        System.out.println("Test run : Monnat buys ticket(s) at IMAX");
        cardAL.get(1).buyTicket(c2, 2);
        
        System.out.println("Test run : Monnat buys ticket(s) at 4DX");
        cardAL.get(1).buyTicket(c3, 4);
        
        System.out.println("Test run : Mike buys ticket(s) at cinema");
//จงเติมคําสั่งให้ Mike ซื้อตั๋วจากโรง cinema 2 ใบ
        cardAL.get(2).buyTicket(c1, 2);
        System.out.println("Test run : Monnat gets 2 free tickets");
// จงเติมคําสั่งให้ Monnat ขอรับตั๋วฟรีของสมาชิกแบบ first class 2 ใบ
        ((MGenFirstClass)cardAL.get(1)).getFreeTicket();
        System.out.println("Test run : Call usePoint() of every object in the array list");
//จงเติมคําสั่งเพื่อวนลูปสั่งให้ทุก object ใน array list ใช้แต้มแลกบัตรฟรี
        for(int i=0;i<cardAL.size();i++){
            cardAL.get(i).usePoint();
        }

    }
}
