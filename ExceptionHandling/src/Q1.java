import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num1,num2, result;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first number:");
			num1 = sc.nextInt();
			
			System.out.println("Enter second number");
			num2= sc.nextInt();
			
			result = num1/num2;
			
			System.out.println("Result is " + result);
			result = sc.nextInt();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Rest of the code");
		
		

	}

}
