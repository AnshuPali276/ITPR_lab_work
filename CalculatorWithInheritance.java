package project1;
import java.util.Scanner; // importing Scanner class for user input
/*---- Defining a Base class ----*/
class Number
{
	//member variable
	protected int num1,num2;
	//---------------------------------------------------------------------------------------
	//method for input of Numbers
	public void inputNumbers()
	{
		//Creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		num1 = sc.nextInt(); //reading user input
		
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();//reading user input
		
		System.out.println("-------------------------------");
	}
	//------------------------------------------------------------------------------------
	//method for displaying data to the user
	public void displayNumber()
	{
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
	}
}
//-----------------------------------------------------------------------------------
/*------ Defining derived class ---------*/
class NumericCalculation extends Number
{
	//method for addition of two numbers
	private void calculateAddition()
	{
		// calling method of base class for input of numbers
		super.inputNumbers();
		//calculating addition
		int sum = super.num1 + super.num2;
		//displaying data to the user
		super.displayNumber();
		System.out.println("Sum : "+sum);
		System.out.println("----------------------------------");
	}
	//method for difference of two numbers
	private void calculateDifference()
	{
		// calling method of base class for input of numbers
		super.inputNumbers();
		//calculating difference
		int sub = super.num1 - super.num2;
		//displaying data to the user
		System.out.println("Difference between "+super.num1+" and "+super.num2+" is : "+sub);
		System.out.println("----------------------------------");
	}

	//method for product of two numbers
	private void calculateProduct()
	{
		// calling method of base class for input of numbers
		super.inputNumbers();
		//calculating product
		long product = super.num1 * super.num2;
		//displaying data to the user
		super.displayNumber();
		System.out.println("Product : "+product);
		System.out.println("----------------------------------");
	}
	
	//method for performing above task by providing a menu to the user
	public void performOperation()
	{
		//Creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			// providing menu to the user
			System.out.println("-------------------------------------");
			System.out.println("----- Numeric Operation -----");
			System.out.println(" 1. Addition \n 2. Difference \n 3. Product");
			System.out.println("--------------------------------------------");
			System.out.print("Select any one operation : ");
			int operation = sc.nextInt();
			switch(operation)
			{
			case 1: System.out.println("------ Addition operation --------");
					calculateAddition();
			break;
			case 2: System.out.println("------ Difference operation --------");
					calculateDifference();
			break;
			case 3: System.out.println("------ Product operation --------");
					calculateProduct();
			break;
			default: System.out.println("Invalid operation");
			}
			System.out.println("------------------------------------");
			System.out.print("Press 0 to exit or any number to continue : ");
			choice = sc.nextInt();
		}while(choice!=0);
	}
}
/*---------------------------------------------------------------------------*/
/*------ Initial class ------------*/
public class CalculatorWithInheritance {

	public static void main(String[] args) {
		//Creating object of derived class 
		NumericCalculation nc=new NumericCalculation();
		nc.performOperation();
	}
}
