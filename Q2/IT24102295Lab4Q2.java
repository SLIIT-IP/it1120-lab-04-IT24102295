import java.util.Scanner;

public class IT24102295Lab4Q2{
      public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           
           System.out.print("Please enter exam marks(out of 100): ");
           double EM = input.nextDouble();
           if (EM<0||EM>100)
           {
               System.out.println("Invalid input for exam marks. Terminating program.");
               return;
           }
           
           System.out.print("Please enter the lab submission marks(out of 100): "); 
           double LM = input.nextDouble();
           if (LM<0||LM>100)
           {
                System.out.println("invalid input for lab submission marks. Terminating program.");
                return;
           }
          
           System.out.print("Please enter the percentage given for the exam: ");
           double PE = input.nextDouble();
           
           System.out.print("please enter the percentage given for the lab submission: ");
           double PL = input.nextDouble();

           if (PE+PL != 100)
           {
           System.out.println("The percentages must add up to 100. Terminating program.");
           return;
           }
           
           double finalMark=(EM*PE/100+LM*PL/100);
           System.out.print("Final Exam Mark is: " +finalMark);
      }
}