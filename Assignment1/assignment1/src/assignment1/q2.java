package assignment1;

public class q2 {
	
static boolean isArmstrong(int n){ 
		
		int originalNum, digits=0, remainder=0, result=0;
		originalNum=n;   
		while(originalNum>0){   
			originalNum = originalNum/10;   
			digits++;   
		}   
		originalNum = n;   
		while(originalNum>0){         
			remainder= originalNum % 10;   
			result +=  (Math.pow(remainder, digits));   
			originalNum = originalNum/10;   
		}    
		if(n==result)    
			return true;      
		else
			return false;   
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=100;i<1000;i++)
			if(isArmstrong(i))
				System.out.println("Number "+i+" is Armstrong");

	}

}
