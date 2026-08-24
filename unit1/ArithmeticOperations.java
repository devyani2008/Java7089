public class ArithmeticOperations 
{

    public static void main(String[] args) 
	{

                int num1 = Integer.parseInt(args[0]);
        	int num2 = Integer.parseInt(args[1]);

               	int addition = num1 + num2;
        	int subtraction = num1 - num2;
        	int multiplication = num1 * num2;

       		System.out.println("First Number: " + num1);
        	System.out.println("Second Number: " + num2);
        	System.out.println("Addition: " + addition);
        	System.out.println("Subtraction: " + subtraction);
        	System.out.println("Multiplication: " + multiplication);

        	if (num2 != 0) 
		{
            		double division = (double) num1 / num2;
            		System.out.println("Division: " + division);
        	} 
		else 
		{
            		System.out.println("Division: Cannot divide by zero.");
        	}
    	}
}