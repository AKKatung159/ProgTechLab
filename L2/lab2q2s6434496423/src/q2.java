/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class q2 {
    public static void main(String[] args) {
        GregorianCalendar gca = new GregorianCalendar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Current Date : "+gca.get(Calendar.DATE)+" "+gca.get(Calendar.MONTH)+", "+gca.get(Calendar.YEAR));
        System.out.print("Enter day : ");
        int day = sc.nextInt();
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        GregorianCalendar gip = new GregorianCalendar(year,month-1,day);
        long distance = (long) ((gca.getTime().getTime()-gip.getTime().getTime())/8.64e7);
        System.out.println("Number of days : "+((Math.abs(distance))));
    }
}