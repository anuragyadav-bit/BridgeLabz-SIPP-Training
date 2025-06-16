import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                int mark = sc.nextInt();
                while (mark < 0) {
                    mark = sc.nextInt();
                }
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            double p = percentages[i];
            if (p >= 80) {
                grades[i] = "A";
            } else if (p >= 70) {
                grades[i] = "B";
            } else if (p >= 60) {
                grades[i] = "C";
            } else if (p >= 50) {
                grades[i] = "D";
            } else if (p >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}
