class FiveStarChicken {

	public static double takeOrder(String foodName) {
	
	if(foodName == "ChickenBurger") {
		return 99.00;
	}
	if(foodName == "CrispyBurger") {
		return 120.00;
	}
	if(foodName == "VegBurger") {
		return 200.00;
	}
	if(foodName == "Chicken65") {
		return 50.00;
	}
	if(foodName == "Kabab") {
		return 60.00 ;
	}
	if(foodName == "Coco Cola") {
		return 150.00 ;
	}
	if(foodName == "Chicken Roll") {
		return 60.00 ;
	}
	if(foodName == "Bucket Chicken") {
		return 100.00 ;
	}
	if(foodName == "Leg Piece") {
		return 150.00 ;
	}
	if(foodName == "Bonda") {
		return 50.00 ;
	}
	if(foodName == "Pongal") {
		return  140.00;
	}
	if(foodName == "Salad") {
		return 60.00 ;
	}
	if(foodName == "Chole Bhature") {
		return 150.00 ;
	}
	if(foodName == "vada") {
		return 40.00 ;
	}
	if(foodName == "Puttu") {
		return 80.00 ;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}



}