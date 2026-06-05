class AddNumbers{

	public static void main(String args[])
	{
	System.out.println("START main()");
	
	String firstNumberStr = args[0];
	String secondNumberStr = args[1];
	
	//==> This convert the number ("1" format to 1 !)

	int firstNumber = Integer.parseInt(firstNumberStr);
	int secondNumber = Integer.parseInt(secondNumberStr);
	
	int sum = firstNumber + secondNumber;
	
	System.out.println("Sum of the numbers is " + sum);
	
	System.out.println(" END main()");
	
	
	}

}