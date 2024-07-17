class BarRunner{

     public static void main(String runner[]){
	 
	  System.out.println("The bar main is started");

	  boolean isAdded=Bar.addWineBrands("A mano");
		  System.out.println("The wine brand is added:" +isAdded);
	   boolean isPrice=Bar.addWinePrice(5000.0);
		  System.out.println("The wine price is added:" +isPrice);
		//1  
		   isAdded=Bar.addWineBrands("Barnag");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(700.0);
		  System.out.println("The wine price is added:" +isPrice);
		//2  
		   isAdded=Bar.addWineBrands("Calon Segur");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(500.0);
		  System.out.println("The wine price is added:" +isPrice);
		 //3 
		   isAdded=Bar.addWineBrands("De boel");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(400.0);
		  System.out.println("The wine price is added:" +isPrice);
		 //4 
		  isAdded=Bar.addWineBrands("El grillo");
		  System.out.println("The wine brand is added:" +isAdded);
	  isPrice=Bar.addWinePrice(3000.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //5
		   isAdded=Bar.addWineBrands("Folc");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(5000.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //6
		  isAdded=Bar.addWineBrands("Gasper");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(5000.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //7
		  isAdded=Bar.addWineBrands("Henners");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(6500.0);
		  System.out.println("The wine price is added:" +isPrice);
		 //8 
		  isAdded=Bar.addWineBrands("Intellego");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(4560.0);
		  System.out.println("The wine price is added:" +isPrice);
		 //9 
		  isAdded=Bar.addWineBrands("Jim barry");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(5790.0);
		  System.out.println("The wine price is added:" +isPrice);
		 //10 
		  isAdded=Bar.addWineBrands("Ken Forrester");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(500.0);
		  System.out.println("The wine price is added:" +isPrice);
		 //11 
		   isAdded=Bar.addWineBrands("La StaffA");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(5056.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //12
		   isAdded=Bar.addWineBrands("Maillet");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(970.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //13
		  isAdded=Bar.addWineBrands("Nekeas");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(5453.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //14
		  isAdded=Bar.addWineBrands("Oenops");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(2340.0);
		  System.out.println("The wine price is added:" +isPrice);
		  //15
		  isAdded=Bar.addWineBrands("Samurai");
		  System.out.println("The wine brand is added:" +isAdded);
	   isPrice=Bar.addWinePrice(1000.0);
		  System.out.println("The wine price is added:" +isPrice);
		  
		  
		  //invoking
	  System.out.println("The available wine brands are");
      Bar.getAllBrands();	  
	  System.out.println("The available wine prices are");
      Bar.getAllPrices();
	  
	  //updated 
	boolean isUpdated=Bar.updateWineBrand("Samurai","SHAFER");
	System.out.println("The updated wine brand is:" +isUpdated);
	  	  	  
	  	 System.out.println("The updated wine brands are:"); 	  
                 Bar.getAllBrands();

         boolean isDeleted = Bar.deleteWine("Intellego");			 
         System.out.println("The deleted wine brand is:" +isDeleted);
               Bar.getAllBrands();
			   
	    System.out.println("The gold items main is ended");
		  
	 
	 }



}