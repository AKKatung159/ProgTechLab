
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author akkatung
 */
public class Q3 {

    public static void main(String[] args) {
        int cnt = 0;
        double sumsc = 0, maxsc = Double.NEGATIVE_INFINITY, minsc = Double.POSITIVE_INFINITY;
        try {
            File scoreFile = new File("src/score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            while (scoreReader.hasNextLine()) {
                double sc = scoreReader.nextDouble();
                sumsc += sc;
                if (maxsc < sc) {
                    maxsc = sc;
                }
                if (sc < minsc) {
                    minsc = sc;
                }
                cnt++;
            }
            scoreReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        System.out.println("Average score = " + (sumsc / cnt));
        System.out.println("Highest score = " + (maxsc));
        System.out.println("Lowest score = " + (minsc));
    }
}
