import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("Java String refers to collection of String which is stored in heap memory.");
		String s2= new String("java String refers to collection of String which is stored in heap memory.");
		
		String lowercase = s1.toLowerCase();
		System.out.println("1. String converted to lowercase as follows: " + lowercase);
		
		String uppercase = s1.toUpperCase();
		System.out.println("2. String converted to uppercase as follows: " + uppercase);
		
		System.out.println(s1.replace('a', '$'));	//replace a to $
		
		if(s1.contains("collection"))	//check for word
		{
			System.out.println("The word collection is present in the given string.");
		}else
		{
			System.out.println("The word collection is not present in the given string.");
		}
		
		//check if s1 and s2 are equal or not
		
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 are equal.");
			
		}else
		{
			System.out.println("s1 and s2 are not equal");
		}
		
		//check s1 and s2 are equal or not (ignore the case)
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 and s2 are equal.");
			
		}else
		{
			System.out.println("s1 and s2 are not equal");
		}
		
		
		

		
	}

}
