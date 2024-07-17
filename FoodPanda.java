class FoodPanda {

	public static double takeOrder(String foodName) {
	
	if(foodName == "ButterscotchIceCreeam") {
		return 99.00;
	}
	if(foodName == "Venilla") {
		return 120.00;
	}
	if(foodName == "OrioMilkShake") {
		return 200.00;
	}
	if(foodName == "ChickenFry") {
		return 50.00;
	}
	if(foodName == "ChickenMasala") {
		return 60.00 ;
	}
	if(foodName == "ChickenGravy") {
		return 150.00 ;
	}
	if(foodName == "MuttonBiriyani") {
		return 300.00 ;
	}
	if(foodName == "Tandoori") {
		return 180.00 ;
	}
	if(foodName == "MuttonKaima") {
		return 250.00 ;
	}
	if(foodName == "ChickenKaima") {
		return 190.00 ;
	}
	if(foodName == "ChickenKabab") {
		return  140.00;
	}
	if(foodName == "VegRoll") {
		return 60.00 ;
	}
	if(foodName == "ChickenRoll ") {
		return 150.00 ;
	}
	if(foodName == "vadaPav") {
		return 40.00 ;
	}
	if(foodName == "MetiBath") {
		return 80.00 ;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}



}