import java.util.*;

class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0, highest = 0, lowest = 100;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student" + (i + 1) + ":");
            marks[i] = sc.nextInt();
            sum += marks[i];
            if (marks[i] > highest)
                highest = marks[i];
            if (marks[i] < lowest)
                lowest = marks[i];
        }
        double average = (double) sum / n;
        System.out.println("\n_______STUDENT REPORT_______");
        System.out.println("Total Students:" + n);
        System.out.println("Average Marks:" + average);
        System.out.println("Highest Marks:" + highest);
        System.out.println("Lowest Marks:" + lowest);

    }

}
