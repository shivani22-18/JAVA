import java.util.Scanner;
abstract class Persistence{
	abstract void persist();
	
}

class FilePersistence extends Persistence{
	void persist() {
		System.out.println("File persisted");
	}
}

class DatabasePersistence extends Persistence{
	void persist() {
		System.out.println("Database persisted");
	}
}

public class Q6_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Data is saved in one of the file");
		String s=sc.nextLine();
		
		FilePersistence f=new FilePersistence();
		DatabasePersistence d=new DatabasePersistence();
		
		if(s.contentEquals("file")){
			f.persist();
		}
		else{
			d.persist();
		}
        
	}

}
