class OrderStatus{
	public static void main(String [] args){
	
	int id = 4453366;
	System.out.println("Your order id: " + id);
	
	String Product = " Laptop ";
	System.out.println("Product : " + Product);
	
	int Price = 77000;
	System.out.println("Product MRP: " + Price);
	
	short GST = 5564;
	System.out.println("Product GST: " + GST);
	
	int Cart = 100001;
	System.out.println("Total cart value: " + Cart);
	
	String Name = "Sarvagay Sanmotra";
	System.out.println("Customer Name : " + Name);
	
	String Pickup = "Parul university, Vadodara, 391760";
	System.out.println("Pickup Address: " + Pickup);
	
	String Delivery = "131, Panjtirthi, Andheri, Jammu 180001";
	System.out.println("Delivered to : " + Delivery);
	
	String Status1 = args[0];
		System.out.println("Status: Tracking: " + Status1);
	
	//String Status2 = args[1];
	//	System.out.println("Status: Out for delivery " + Status2);
		
	//String Status3 = args[2];
	//	System.out.println("Status: Delivered " + Status3);
		
	boolean boxPacked = true;
		if(boxPacked){
		System.out.println("Order Package status: Yes box is packed");
		}
	
	}

}