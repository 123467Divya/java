class Zepto {

	public static double takeOrder(String foodName) {
	
	if(foodName == "Panner Biriyani") {
		return 99.00;
	}
	if(foodName == "Panner Roll") {
		return 120.00;
	}
	if(foodName == "PannerKadai") {
		return 200.00;
	}
	if(foodName == "FullMeals") {
		return 50.00;
	}
	if(foodName == "RiceSambhar") {
		return 60.00 ;
	}
	if(foodName == "Jamoon") {
		return 150.00 ;
	}
	if(foodName == "FriedRice") {
		return 60.00 ;
	}
	if(foodName == "VegFriedRice") {
		return 100.00 ;
	}
	if(foodName == "ChickenFriedRice") {
		return 150.00 ;
	}
	if(foodName == "Amblet") {
		return 50.00 ;
	}
	if(foodName == "EggRice") {
		return  140.00;
	}
	if(foodName == "ChickenKababFriedRice") {
		return 230.00 ;
	}
	if(foodName == "ChickenTavaFry ") {
		return 150.00 ;
	}
	if(foodName == "TavaCurry") {
		return 200.00 ;
	}
	if(foodName == "BoiledEgg") {
		return 80.00 ;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}



}