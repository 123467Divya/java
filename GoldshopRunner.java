class GoldshopRunner{


     public static void main(String runner[]){
	 
	 	System.out.println("The gold items main is started");

	  boolean isAdded=Goldshop.addGoldItem("Gold Ring");
		  System.out.println("The gold item is added:" +isAdded);
	 boolean isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  isAdded=Goldshop.addGoldItem("Silver Bangle");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
      isAdded=Goldshop.addGoldItem("Silver Necklace");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  isAdded=Goldshop.addGoldItem("Designer Gold Bangle");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  isAdded=Goldshop.addGoldItem("Trendy designer gold earring");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Kids Jewellary");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Silver Ring");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Diamond Necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("gold coin");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
     isAdded=Goldshop.addGoldItem("Gold necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Diamond Ring");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("silver trendy Ring");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Gold bangle");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Diamond necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=Goldshop.addGoldItem("Diamond necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
		  isAdded=Goldshop.addGoldItem("Diamond necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=Goldshop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  
	  //invoking
	  System.out.println("The available gold items are");
	  Goldshop.getGoldItems();
	  
	  System.out.println("The available gold item prices are");
	  Goldshop.getGoldItemPrices();
	  
	  //updated 
	boolean isUpdated=Goldshop.updateGoldItem("Gold Ring","Diamond Ring");
	System.out.println("The updated gold item is:" +isUpdated);
	  	 System.out.println("The updated gold items are:"); 	  
	  	 System.out.println("The updated gold items are:"); 	  
			  Goldshop.getGoldItems();
			  
			  
			  boolean goldItemDeleted = Goldshop.deleteGoldItem("Gold bangle");
		          System.out.println("is  gold item deleted: " +goldItemDeleted);
                  Goldshop.getGoldItems();

	 
	    System.out.println("The gold items main is ended");
	 
	 
	 }


}