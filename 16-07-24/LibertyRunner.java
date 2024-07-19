class LibertyRunner{

     public static void main(String runner[]){
	 
	  	System.out.println("The liberty main is started");
		
		boolean isAdded=Liberty.addShoeBrands("Bata");
		  System.out.println("The shoe brand is added:" +isAdded);
	   boolean isPrice=Liberty.addShoePrice(5000.0);
		  System.out.println("The shoe price is added:" +isPrice);
		 //1 
	   isAdded=Liberty.addShoeBrands("Woodland");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		 //2 
		  isAdded=Liberty.addShoeBrands("Adidas");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
         //3
		 isAdded=Liberty.addShoeBrands("Nike");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //4
		  isAdded=Liberty.addShoeBrands("Reebok");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //5
		  isAdded=Liberty.addShoeBrands("Puma");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //6
		  isAdded=Liberty.addShoeBrands("RedTYpe");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		 //7 
		  isAdded=Liberty.addShoeBrands("Liberty");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //8
		  isAdded=Liberty.addShoeBrands("Skechers");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //9
		  isAdded=Liberty.addShoeBrands("Clarks");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //10
		  isAdded=Liberty.addShoeBrands("Hush Puppies");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //11
		  isAdded=Liberty.addShoeBrands("Lee Cooper");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //12
		  isAdded=Liberty.addShoeBrands("Fila");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //13
		  isAdded=Liberty.addShoeBrands("Aparx");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //14
		  isAdded=Liberty.addShoeBrands("Relaxo");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  //15
		  isAdded=Liberty.addShoeBrands("Cross");
		  System.out.println("The shoe brand is added:" +isAdded);
	   isPrice=Liberty.addShoePrice(700.0);
		  System.out.println("The shoe price is added:" +isPrice);
		  
		    //invoking
	  System.out.println("The available shoe brands are");
      Liberty.getAllShoeBrands();	  
	  System.out.println("The available shoe prices are");
      Liberty.getAllShoePrices();
	  
	  //updated 
	boolean isUpdated=Liberty.updateShoeBrand("Cross","Khadim's");
	System.out.println("The updated shoe brand is:" +isUpdated);
	  	  	  
	  	 System.out.println("The updated shoe brands are:"); 	  
      Liberty.getAllShoeBrands();	  

		  boolean ShoesDeleted = Liberty.deleteShoeBrand("Aparx");
		          System.out.println("is  gold item deleted: " +ShoesDeleted);
                  Liberty.getAllShoeBrands();	
		  
	 	System.out.println("The liberty main is ended");

	 }


}