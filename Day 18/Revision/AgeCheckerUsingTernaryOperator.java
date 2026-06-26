class AgeCheckerUsingTernaryOperator{

	public static void main(String[] args){
	
	int age = Integer.parseInt(args[0]);
	
	char result = (age>= 18)? 'A' : 'M';
	
	System.out.println("You are: "+ result);
	
	}


}