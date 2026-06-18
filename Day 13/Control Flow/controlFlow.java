class controlFlow{

	public static void main (String[] args){
	
	int amount = Integer.parseInt(args[0]);
	
	boolean deliveryStatus = controlFlow.checkDelStatus(amount);
		System.out.println("You have placed your order successfully, You got "+ deliveryStatus);
	
	}
	private static boolean checkDelStatus(int amount){
	
	boolean status = false;
	
	if(amount>= 10000){
		System.out.println("Free Delivery");
		return true;
		}else{
			System.out.println("No free delivery");
		}
			return status;
	              // check free delivery if order value is 350 and above
	}
	
}