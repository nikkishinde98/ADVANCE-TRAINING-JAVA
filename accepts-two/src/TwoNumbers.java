import java.util.*;

class TwoNumbers
{
	public static void main(String[] args) 
	{
    
    Scanner sc=new Scanner(System.in);
    int num1 = 1, num2 = 3;
    System.out.print("Enter the number : ");
    int n=sc.nextInt();   //Declare and Initialize the number of terms
    System.out.println("First " + n + " numbers of sequence: ");
    
    for (int i = 1; i <= n; ++i)
    {
        System.out.print(num1 + " ");
        int sum = num1 + num2;
        num1 = num2;
        num2 = sum;
    }
}
}