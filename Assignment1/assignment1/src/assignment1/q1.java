package assignment1;

public class q1 {
	
	public static void main(String[] args) {

        int num1 = 153, originalNum, remainder, result = 0;

        originalNum = num1;

        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        if(result == num1)
            System.out.println(num1 + " is an Armstrong number.");
        else
            System.out.println(num1 + " is not an Armstrong number.");
    }

	}
	

