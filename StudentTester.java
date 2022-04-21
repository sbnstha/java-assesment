/* Sabin Shrestha 
Student id:s4604465
Lab 3 
I have tried using all jgrasp apache ,etc. not downloadng so i havn't finished my uml diagram.
Thanks
*/
package Task1;
import java.text.*;
import java.util.Scanner;


public class StudentTester {


public static void main(String[] args) {
String Name; 
int n=1;
double Grade;

NumberFormat format2 = NumberFormat.getPercentInstance(); ;


Scanner input = new Scanner(System.in);  
System.out.print("Enter you Name: " );
Name=input.next();

Student student = new Student(Name);

System.out.print("Enter Number of Quizes: " );
int limit=input.nextInt();
double [] score = new double[limit];

for(int j=0;j<limit; j++){
System.out.print("Grade" +n+": ");  
Grade =input.nextDouble();
score[j]=Grade;
student.addQuiz(Grade);
n++;
Grade=0;
}

System.out.println("Dear Student: "+student.getName() + " You have Entered Grade:");
System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
for(int j=0;j<limit; j++){
System.out.print("Grade" +n+": " +score[j] +"\t"); 
}
System.out.println("\n\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

System.out.println("Total quizes score: "+student.getTotalScore());      
System.out.println("The Average quizes score: "+format2.format(student.getAverageScore()));

System.out.println("The Highest score:                ");
System.out.println("The Lowest score:                 ");

// finish to print the High and LowScore
}


}