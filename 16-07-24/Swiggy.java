

//Multiple if Statement example


class Swiggy {

	public static double takeOrder(String foodName) {
	
	if(foodName == "Pizza") return 99.00;
	
	if(foodName == "Burger") return 120.00;
	
	if(foodName == "Biryani") return 200.00;
	
	if(foodName == "Dosa") return 50.00;
	
	if(foodName == "Idli") return 60.00 ;
	
	if(foodName == "Poha") return 150.00 ;
	
	if(foodName == "Paratha") return 60.00 ;
	
	if(foodName == "Poori") return 100.00 ;
	
	if(foodName == "Bath") return 150.00 ;
	
	if(foodName == "Bonda") return 50.00 ;
	
	if(foodName == "Pongal") return  140.00;
	
	if(foodName == "Salad") return 60.00 ;
	
	if(foodName == "Chole Bhature") return 150.00 ;
	
	if(foodName == "vada") return 40.00 ;
	
	if(foodName == "Puttu") return 80.00 ;

	else System.out.println(foodName + " not found ");
		return 0.0;
	
	
	
	}
	public static double takeOrder(String foodName,int quantity){
		double price=0.0;
	if(foodName == "Pizza") {     
       price=99.00*quantity;
		return price;
	}
	if(foodName == "Burger"){
        price=120.00*quantity;
		return price;
	}
	
	if(foodName == "Biryani"){
		price=200.00*quantity;
		return price;
	}
	
	if(foodName == "Dosa"){
       price=50.00*quantity;
		return price;
	}
	
	if(foodName == "Idli"){
      price=60.00*quantity;		
	return price;
	}
	
	if(foodName == "Poha"){
		price=150.00*quantity;
		return price ;
	}
	
	if(foodName == "Paratha"){
        price=60.00*quantity;
		return price ;
	}
	
	if(foodName == "Poori"){
          price=100.00*quantity;
		return price ;
	}
	
	if(foodName == "Bath"){
		price=150.00*quantity;
		return price;
	}
	
	if(foodName == "Bonda"){
         price=500.00*quantity;
		return price ;
	}
	
	if(foodName == "Pongal"){
        price=140.00*quantity;
		return  price;
	}
	
	if(foodName == "Salad"){
           price=60.00*quantity;
		return price ;
	}
	
	if(foodName == "Chole Bhature"){
           price=150.00*quantity;
		return price ;
	}
	
	if(foodName == "vada"){
          price=120.00*quantity;
		return price ;
	}
	
	if(foodName == "Puttu"){
       price=80.00*quantity;
		return price ;
	}

	else System.out.println(foodName + " not found ");
		return price;
	}
    }



