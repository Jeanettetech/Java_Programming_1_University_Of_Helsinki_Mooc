
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jeane
 */
public class GradePoints {

    private ArrayList<Integer> grades;

    public GradePoints() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade > 0 && grade < 100) {
            this.grades.add(grade);
        }
    }

    public double average() {
        double result = 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        result = 1.0 * sum / grades.size();
        return result;
    }

    public String averagePassing() {

        double result = 0;
        int sum = 0;
        int passCount = 0;

        for (int grade : this.grades) {

            if (grade > 49) {
                passCount++;
                sum += grade;
            }

        }

        result = 1.0 * sum / passCount;
        if (sum == 0) {
            return "-";
        } else {

            return result + "";
        }

    }

    public String passPercentage() {
        int count = 0;

        double result = 0;

        for (int grade : this.grades) {

            if (grade > 49) {

                count++;
            }
        }
        result = 100.0 * count / grades.size();

        return result + "";

    }

    public void printGradeDistribution() {

        int[] gradeArray = new int[6]; // 0 through 5

        for (int grade : this.grades) {

            if (grade >= 90) {
                gradeArray[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeArray[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeArray[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeArray[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeArray[4]++;
            } else if (grade <= 49) {
                gradeArray[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradeIndex = 5;

        for (int e : gradeArray) {
            System.out.print(gradeIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n");
            gradeIndex--;
        }

    }

    public void printGrades() {
        System.out.println("Point average (all): " + this.average());
        System.out.println("Point average (passing): " + this.averagePassing());
        System.out.println("Pass percentage: " + this.passPercentage());
        printGradeDistribution();
    }

}
