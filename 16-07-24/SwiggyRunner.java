class SwiggyRunner {

	public static void main(String runner[]) {
	
	  /*String foodname = "Pongal";
		double price = Swiggy.takeOrder(foodname);
		System.out.println("The "+foodname +" price is "+price);*/
		
		String foodName="Pongal";
		System.out.println("the order food is:"+foodName);
		double foodPrice=Swiggy.takeOrder("Pongal",4);
		System.out.println("the order food price:"+foodPrice);
		
	
	}



}