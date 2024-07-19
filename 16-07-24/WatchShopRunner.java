class WatchShopRunner{

    
       public static void main(String runner[]){
	   
	    System.out.println("The main is started");
		
		boolean isCreated=WatchShop.createWatchBrandNames("Titan");
		System.out.println("The watch brand is added:" +isCreated);
		boolean isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
		 isCreated=WatchShop.createWatchBrandNames("Samsung");
		System.out.println("The watch brand is added:" +isCreated);
		 isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
		
	   isCreated=WatchShop.createWatchBrandNames("Grand Seiko");
		System.out.println("The watch brand is added:" +isCreated);
		 isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	    isCreated=WatchShop.createWatchBrandNames("Omega");
		System.out.println("The watch brand is added:" +isCreated);
		isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	    isCreated=WatchShop.createWatchBrandNames("Fossil gen");
		System.out.println("The watch brand is added:" +isCreated);
		 isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	    isCreated=WatchShop.createWatchBrandNames("Fire-Boltt");
		System.out.println("The watch brand is added:" +isCreated);
		 isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	    isCreated=WatchShop.createWatchBrandNames("Samsung Galaxy");
		System.out.println("The watch brand is added:" +isCreated);
	    isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	   isCreated=WatchShop.createWatchBrandNames("Boat Wave");
		System.out.println("The watch brand is added:" +isCreated);
	   isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	   isCreated=WatchShop.createWatchBrandNames("Fastrack");
		System.out.println("The watch brand is added:" +isCreated);
	   isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
		
	   isCreated=WatchShop.createWatchBrandNames("Titan Analog ");
		System.out.println("The watch brand is added:" +isCreated);
	   isPrice=WatchShop.getWatchPrice(5000.0);
		  System.out.println("The watch price is added:" +isPrice);
	   
	  //invoking
	   System.out.println("The watch names are:");
	       WatchShop.getWatchNames();
	   System.out.println("The watch prices are:");
	   	   WatchShop.getWatchPrices();
		   
		   //updation
      boolean isUpdated=WatchShop.updateWatchBrands("Titan","Blancpain");
       System.out.println("The updated brand name is:" +isUpdated);
      System.out.println("The updated list is");	  
	 	       WatchShop.getWatchNames();

         boolean isDeleted = WatchShop.deleteWatch("Samsung");			 
         System.out.println("The deleted watch brand is:" +isDeleted);
               WatchShop.getWatchNames();


	    System.out.println("The main is ended");
	   
	   
	   }





}