class ZamotaRunner {

	public static void main(String runner[]) {
	
		/*double price = Zamota.takeOrder("RiceBath");
		System.out.println(price);*/
		
		String foodName="Bisibelebath";
		System.out.println("the order food is:"+foodName);
		double foodPrice=Zamota.takeOrder("Bisibelebath",2);
		System.out.println("the order food price:"+foodPrice);
		
	
	}



}