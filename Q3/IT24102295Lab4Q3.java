import java.util.Scanner;

public class IT24102295Lab4Q3
{
        public static void main(String []args)
        {
             Scanner input = new Scanner(System.in);

             System.out.print("Enter a number :");
             int number=input.nextInt();

             String num=number >0? "positive":number <0? "negetive":"zero";
             System.out.print("The number is "+num);
        }
}
           