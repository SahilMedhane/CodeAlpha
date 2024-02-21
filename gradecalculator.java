import java.util.ArrayList;
import java.util.Scanner;


class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        ArrayList<Double> grades = new ArrayList<>();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }
        
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);
        
        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = sum / numStudents;
        
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        scanner.close();
    }
}
