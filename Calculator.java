import java.util.Scanner;

class Calculator
{
	public static void add(double no1 , double no2){				
		System.out.println("\nAddition is : "+ (no1 + no2));
	}
	
	public static void sub(double no1 , double no2){
		System.out.println("\nSubstraction is : "+ (no1 - no2));
	}

	public static void mul(double no1 , double no2){
		System.out.println("\nMultiplication is : "+ no1 * no2);
	}

	public static void div(double no1 , double no2){		
		if (no2 == 0){
            		System.out.println("\nError: Division by zero is not allowed.");
		}
		System.out.println("\nDivision is : "+ no1 / no2);    
    	}

	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);

		System.out.println("\n**JAVA CONSOLE CALCULATOR**");

		while(true){
			
			System.out.println("\nSelect Operations:");
			System.out.println("1. Addition (+)");
			System.out.println("2. Substraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("5. Exit");

			System.out.print("\nEnter your choice (1-5): ");
			int choice = sc.nextInt();

			if(choice == 5){
				System.out.println("Exiting calculator!");
                		break;
			}

			System.out.print("Enter First Number : ");
			Double num1 = sc.nextDouble();
			
			System.out.print("Enter Second Number : ");
			Double num2 = sc.nextDouble();
			
			switch(choice){

			case 1: 
				add(num1,num2);
				break;

			case 2: 
				sub(num1,num2);
				break;

			case 3:
				mul(num1,num2);
				break;
			
			case 4:
				div(num1,num2);
				break;

			default:
				System.out.println("\nInvalid choice. Please try again!!");
			}
		}
		sc.close();
	}
}