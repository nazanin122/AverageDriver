/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagedriver;
import java.util.Scanner;

/**
 *
 * @author Naz
 */
class Average {
        private int[] data;
    private double mean;
    
    public Average() {
        data = new int[5]; 
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter score number " + (i + 1) + ":");
            data[i] = scanner.nextInt(); 
        }
        
        selectionSort();
        
        calculateMean();
    }

    public void calculateMean() {
        int total = 0; 
        
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        
        mean = (double) total / data.length;
    }

    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

public String toString() {
    String result = "Scores in descending order:\n";
    
    for (int i = 0; i < data.length; i++) {
        result += data[i] + "\n";  // 
    }
    
    result += "Mean: " + mean + "\n";
    
    return result;  
    }

}
