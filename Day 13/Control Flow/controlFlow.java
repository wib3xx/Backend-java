class controlFlow{

	public static void main (String[] args){
	
	int amount = Integer.parseInt(args[0]);
	
	boolean deliveryStatus = controlFlow.checkDelStatus(amount);
		System.out.println("Your delivery is Free or Paid = "+ deliveryStatus);
	
	}
	private static boolean checkDelStatus(int amount){
	
	boolean status = false;
	
	if(amount>= 10000){
		return true;
		}
			return status;
	              // check free delivery if order value is 350 and above
	}
	
}