package CodeAlpha;

import java.util.Scanner;
import java.util.Arrays;    

public class Student_Grade_Tracker {
    public static void main(String [] args){
       
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        
        double [] studentScore = new double [num];
        System.out.println("Enter the respective scores for each students. ");
        
        double sum = 0;
        for (int i=0; i<num; i++){
            System.out.print("Score of student "+(i+1) +":");
            studentScore[i]=input.nextDouble();
            sum = studentScore [i] + sum;
        
        }
        
        double average = sum/num;
        
        double highest = studentScore[0];
        double lowest = studentScore[0];
        
        for (int i = 0; i<num; i++){
            if(studentScore[i]<lowest)
                lowest=studentScore[i];
            
            if(studentScore[i]> highest)
                highest = studentScore[i];
        
        }
        
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
    
    }
    
}
