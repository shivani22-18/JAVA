package assignment1;

import java.util.Scanner;  
public class q7_searchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, num;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements:");  

		n=sc.nextInt();  
		int[] a = new int[15]; 
		for(i=0;i<n;i++)
        {
       	 a[i]=sc.nextInt();
        }
		
	     System.out.println("Enter element to be searched");
         num=sc.nextInt();
         //search for the element
         for(i=0;i<n;i++)
         {
        	 if(num==a[i])
             {
            	 System.out.println(num +" is present at position "  +i);
            	 break;
             }	 
         }
         if(i==n)
         {
        	 System.out.println(num +"is not present in the given list");
         }


	}

}
