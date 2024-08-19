import java.util.Scanner;

public class StudentGrade {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of students: ");
      int n = sc.nextInt();

      int[][] marks = new int[n][3];
      char[][] grades = new char[n][3];

      for (int i = 0; i < n; i++) {
        System.out.printf("Enter marks for student %d (out of 100) in three subjects: ", i+1);
        for (int j = 0; j < 3; j++) {
          marks[i][j] = sc.nextInt();
          if (marks[i][j] >= 80) {
            grades[i][j] = 'A';
          } else if (marks[i][j] >= 60) {
            grades[i][j] = 'B';
          } else if (marks[i][j] >= 40) {
            grades[i][j] = 'C';
          } else {
            grades[i][j] = 'D';
          }
        }
      }

      // Print the grades achieved by all students
      System.out.println("Grades achieved by all students:");
      for (int i = 0; i < n; i++) {
        System.out.printf("Student %d: ", i+1);
        for (int j = 0; j < 3; j++) {
          System.out.printf("%c ", grades[i][j]);
        }
        System.out.println();
      }
    }
  }
}

