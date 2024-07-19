class Zamota {

	public static double takeOrder(String foodName) {
	
	if(foodName == "MasalaDose") {
		return 99.00;
	}
	if(foodName == "Vegpalav") {
		return 120.00;
	}
	if(foodName == "vegcurry") {
		return 200.00;
	}
	if(foodName == "plainDosa") {
		return 50.00;
	}
	if(foodName == "RavaIdli") {
		return 60.00 ;
	}
	if(foodName == "OnionDosa") {
		return 150.00 ;
	}
	if(foodName == "AlooParatha") {
		return 60.00 ;
	}
	if(foodName == "Poorisaagu") {
		return 100.00 ;
	}
	if(foodName == "RiceBath") {
		return 150.00 ;
	}
	if(foodName == "BondaSoopu") {
		return 50.00 ;
	}
	if(foodName == "SweetPongal") {
		return  140.00;
	}
	if(foodName == "Bisibelebath") {
		return 60.00 ;
	}
	if(foodName == "Orange Juice ") {
		return 150.00 ;
	}
	if(foodName == "MangoJuice") {
		return 40.00 ;
	}
	if(foodName == "GrapesJuice") {
		return 80.00 ;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	}

     public static double takeOrder(String foodName,int quantity){
		double price=0.0;
	if(foodName == "MasalaDose") {
		price=99.00*quantity;
		return price;
	}
	if(foodName == "Vegpalav") {
		price=120.00*quantity;
		return price;
	}
	if(foodName == "vegcurry") {
		price=200.00*quantity;
		return price;
	}
	if(foodName == "plainDosa") {
		price=50.00*quantity;
		return price;
	}
	if(foodName == "RavaIdli") {
		price=60.00*quantity;
		return price ;
	}
	if(foodName == "OnionDosa") {
		price=150.00*quantity;
		return price;
	}
	if(foodName == "AlooParatha") {
		price=60.00*quantity;
		return price ;
	}
	if(foodName == "Poorisaagu") {
		price=100.00*quantity;
		return price ;
	}
	if(foodName == "RiceBath") {
		price=150.00*quantity;
		return price ;
	}
	if(foodName == "BondaSoopu") {
		price=50.00*quantity;
		return price ;
	}
	if(foodName == "SweetPongal") {
		price=140.00*quantity;
		return  price;
	}
	if(foodName == "Bisibelebath") {
		price=60.00*quantity;
		return price ;
	}
	if(foodName == "Orange Juice ") {
		price=150.00*quantity;
		return price;
	}
	if(foodName == "MangoJuice") {
		price=40.00*quantity;
		return price ;
	}
	if(foodName == "GrapesJuice") {
		price=80.00*quantity;
		return price ;
	}
	else System.out.println(foodName + " not found ");
		return price;
	}


}