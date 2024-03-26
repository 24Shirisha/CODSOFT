import java.util.Scanner;
public class Studentgradecalculator 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
// giving the number of subjects
System.out.print("Enter the number of subjects: ");
int numSubjects = scanner.nextInt();
// Validate the number of subjects
if (numSubjects <= 0) 
{
System.out.println("Invalid number of subjects. Exiting...");
return;
}
// Initializing variables
int finalMarks = 0;
// Input marks for each subject
for (int i = 1; i <= numSubjects; i++) 
{
System.out.print("Enter marks for Subject " + i + " out of 100: ");
int marks = scanner.nextInt();
// Validate marks (assume marks are out of 100)
if (marks < 0 || marks > 100) {
System.out.println("Invalid marks. Marks should be between 0 and 100. Exiting...");
return;
}
// Sum up the total marks
finalMarks += marks;
}
// Calculate average percentage
double avgPercentage = (double) finalMarks / numSubjects;
// Determine the grade based on the average percentage
char grade = calculateGrade(avgPercentage);
// Display the results
System.out.println("\n\n***RESULTS***");
System.out.println("Total Marks: " + finalMarks);
System.out.println("Average Percentage: " + avgPercentage + "%");
System.out.println("Grade: " + grade);
scanner.close();
}
private static char calculateGrade(double avgPercentage) {
if (avgPercentage >= 90) {
return 'A';
} 
else if (avgPercentage >= 80) {
return 'B';
} 
else if (avgPercentage >= 70) {
return 'C';
} 
else if (avgPercentage >= 60) {
return 'D';
} 
else {
return 'F';
}
}
}