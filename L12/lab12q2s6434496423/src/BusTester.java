
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class BusTester {
    public static void main(String[] args) {
    ArrayList<Bus> arr = new ArrayList<>();
    arr.add(new Hybrid(150,1,600,45,1200000));
    arr.add(new CNGBus(200,2,50,1000000));
    for(int i=0;i<arr.size();i++){
        if(arr.get(i).getClass().getName().equals("Hybrid")){
            Hybrid a=(Hybrid)arr.get(i);
            System.out.println("ID : "+a.getID()+"\nEmission Tier : "+a.getEmissionTier()+"\nAccel : "+a.getAccel());
        }
        if(arr.get(i).getClass().getName().equals("CNGBus")){
            CNGBus a=(CNGBus)arr.get(i);
            System.out.println("ID : "+a.getID()+"\nEmission Tier : "+a.getEmissionTier()+"\nAccel : "+a.getAccel());
        }
    }
    }
}