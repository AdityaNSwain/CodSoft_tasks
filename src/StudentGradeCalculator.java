import java.util.Scanner;	
public class StudentGradeCalculator {

	  public static void main(String[] args) {
	       // TODO Auto-generated method stub
				
		   System.out.println("STUDENT GRADE CALCULATOR");
		   System.out.println();
				
		   int numSub; int totalMarks = 0; double avgPercentage; int i;
				
		   Scanner ref = new Scanner(System.in);
		   System.out.print("Enter The Number Of Subjects: ");
		   numSub = ref.nextInt();
				
		   int Marks[] = new int[numSub];
		   for(i=0;i<numSub;i++)
		   {
			   System.out.print("Enter The Marks Obtained in Subject "+(i+1)+": ");
			   Marks[i] = ref.nextInt();
			   totalMarks += Marks[i];
		   }
				
		   avgPercentage = (double)totalMarks/numSub;
				
		   char grade;
		   if(avgPercentage >=90)
		   {
			   grade = 'A';
		   }
	       else if(avgPercentage >=80)
		   {
		       grade = 'B';
		   }
		   else if(avgPercentage >=70)
		   {
		       grade = 'C';
		   }
		   else if(avgPercentage >=60)
		   {
			   grade = 'D';
		   }
		   else if(avgPercentage >=50)
		   {
			   grade = 'E';
		   }
		   else if(avgPercentage >=40)
		   {
			   grade = 'F';
		   }
		   else
		   {
			   grade = 'O';
		   }
		   System.out.println();
				
		   System.out.println("----- RESULT -----");
		   System.out.println("Total Marks Obtained: "+totalMarks);
		   System.out.println("Average Percentage Obtained: "+avgPercentage);
		   System.out.println("Grade Obtained: "+grade);
		   }
}