package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simple_compound {
	
	public static void main(String[] args) throws IOException {
		

		
        double t = 2;
        float r = 12;
        double simpleinterest,compoundinterest;
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter amount");
		float a = Integer.parseInt(reader.readLine());
		
		simpleinterest = a*r*t/100;
		System.out.println("Simple interest is " + simpleinterest);
	
		 
        compoundinterest=a*Math.pow(1.0+r/100.0,t)-a;
        System.out.println("compound interest is " + compoundinterest );
	}

	

}
