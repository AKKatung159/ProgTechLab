
import java.io.File;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akkatung
 */
public class DirectorySize {
    public static void main(String[] args) {
        //Prompt the user to enter a directory or a file
        System.out.println("Enter a directory or a file : ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        
        //Display the size
        System.out.println(getSize(new File(directory))+"bytes");
    }
    public static int getSize(File f){
        if(f.isFile()){
            return (int) f.length();
        }
        else if (f.isDirectory()){
            int size=0;
            for (String list : f.list()) {
                size += getSize(new File(f.getPath()+"/" + list));
            }
            return size;
        }
        return 0;
    }
}