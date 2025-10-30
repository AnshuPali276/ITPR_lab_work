/*-----BaseClass ----*/
class BaseClass
{
	public void welcome()
	{
		System.out.println("Welcome to my page");
		System.out.println("------------------------------");
	}
	
	public void display()
	{
		System.out.println("This is method of base class");
		System.out.println("----------------------------------");
	}
}
/*------------------------------------------------------------*/
/*---- Derived class -----*/
class DerivedClass extends BaseClass
{
	public void greeting()
	{
		System.out.println("--- Good Evening -----");
		System.out.println("-----------------------------");
	}
	
	public void display()
	{
		System.out.println("This is method of derived class");
		System.out.println("----------------------------------");
		
	}
}
/*----------------------------------*/
public class OverridingExample {

	public static void main(String[] args) {
		/*---- Object of base class ------*/
		System.out.println("---- Object of Base class -----");
		BaseClass obj1 = new BaseClass();
		obj1.welcome();
		obj1.display();
		//obj1.greeting();
		/*---------------------------------------------------*/
		System.out.println("-----Object of Derived class-----");
		DerivedClass obj2=new DerivedClass();
		obj2.welcome();
		obj2.display();
		obj2.greeting();
		/*-------------------------------------------------------*/
		System.out.println("----- Object of Derived class from reference of Base class");
		BaseClass obj3 = new DerivedClass();
		obj3.welcome();
		obj3.display();//overrided method
		//obj3.greeting();
		
	}

}
