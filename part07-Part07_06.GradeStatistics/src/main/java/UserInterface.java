/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
import java.util.Scanner;

public class UserInterface {

    private GradePoints gradePoints;
    private Scanner scanner;

    public UserInterface( Scanner scanner, GradePoints gradePoints) {
        this.gradePoints = gradePoints;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops");
 
        while (true) {
            
            int points =  Integer.valueOf(scanner.nextLine());;
            if (points == -1) {
                
                gradePoints.printGrades();
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            this.gradePoints.addGrade(points);
        }
    }
   
}

//    public void printGradeDistribution() {
//        int grade = 5;
//        while (grade >= 0) {
//            int stars = register.numberOfGrades(grade);
//            System.out.print(grade + ": ");
//            printsStars(stars);
//            System.out.println("");
//
//            grade = grade - 1;
//        }
//        System.out.println("The average of points:"+register.averageOfPoints());
//        System.out.println("The average of points:"+register.averageOfGrades());
//        
//    }
//
//    public static void printsStars(int stars) {
//        while (stars > 0) {
//            System.out.print("*");
//            stars--;
      

