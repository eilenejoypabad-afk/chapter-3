//Eilene Joy Abad 
//BSIT NS 1-1 
package helloworld.control;

import java.util.Scanner;

public class Grades
  {
    public static void main(String[] args) 
    {
        Scanner ES = new Scanner(System.in);
        String score;
        char grade;

        System.out.println("Enter your score:");
        score = ES.next();
        int scores = Integer.parseInt(score);

        if (scores >= 90)
            grade = 'A';
        else if (scores >= 80)
            grade = 'B';
        else if (scores >= 70)
            grade = 'C';
        else if (scores >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Score = " + scores);
        System.out.println("Grade = " + grade);
    }
}
