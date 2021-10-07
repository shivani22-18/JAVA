abstract class A      //entire class is abstract
{
	 abstract void show();
}

abstract class B extends A	// cant be instantiated & declared subclass as abstract
{
     public void show()	//cant be private
	{
		System.out.println("hi");
	}
}
class C extends A
{
    void show() {              // method overriding 
	System.out.println("hello");
	}
}
public class Q4_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	           C obj=new C();
//	           B obj1 = new B(); // this will give error
	           obj.show();
		
	}

}
