/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar gca = new GregorianCalendar();
        System.out.println("Current Date : "+gca.get(Calendar.DATE)+"-"+gca.get(Calendar.MONTH)+"-"+gca.get(Calendar.YEAR));
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        Random rand = new Random ();
        int day = rand.nextInt(28)+1)
        int month = rand.nextInt(11)+1)
        int year = rand.nextInt(2000:2021)+1)
        GregorianCalendar gip = new GregorianCalendar(year,month-1,day);
        long distance = (long) ((gca.getTime().getTime()-gip.getTime().getTime())/8.64e7);
        System.out.println("Number of days : "+((Math.abs(distance))+1));
    }
}