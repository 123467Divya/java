class Goldshop{
     static String name="Sri Ganapathi Jewellery Shop";
	 static String ownerName="Ganapathi";
	 static String goldNames[]={null,null,null,null,null,null,null};
	 //static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	 static int chatNameIndex;
	 //static int chatpriceIndex;
	 
	 public static boolean createGoldName(String goldName){
	 System.out.println("createGoldName started");
	 boolean isGoldNameCreated=false;
	
	// Create operation
	
	//0<6
	 if(goldNameIndex < goldNames.length){
	 if(goldName !=null){
	 
	   goldNames[goldNameIndex] = goldName;
	   goldNameIndex++;
	   isGoldNameCreated=true;
	 
	 }else System.out.println("Gold name is null, cannot be added");
	 }else{
		 System.out.println("Gold names are full....");
	 }
	 
	 System.out.println("createGoldtName ended");
	 return isGoldNameCreated;
	 
	 }
	 
	/* public static boolean addChatprice(double chatPrice){
		 System.out.println("isChatPriceAdded started");
		 boolean isPriceAdded = false;
		 if(chatPrice > 0){
			 chatPrices[chatpriceIndex] = chatPrice;
			 chatpriceIndex++;
			 isPriceAdded = true;
		 }else{
			 System.out.println("chat price is null,  cannot be added");
		 }
		  System.out.println("isChatPriceAdded ended");
		  return isPriceAdded;
		 
		 
	 }*/
    public static void getDetails(){
	
	 System.out.println("The available golds are:");
	 
	 for(String Goldname:goldNames)
	 
	 
	 System.out.println("The goldnames are: "+Goldname);

	
	}
	 //upadated operation
	public static boolean updateGoldName(String oldGoldName , String newGoldName){
		
		System.out.println("UpdateGoldname started");
		    boolean isUpdatedGoldname = false;
			
			for(int index=0;index<goldNames.length;index++){
				if(oldGoldName == goldNames[index]){
					
				goldNames[index]   = newGoldName;
				
				isUpdatedGoldname = true;
				}
		
			}
			if(isUpdatedGoldname == false){
				
				System.out.println(oldGoldName  + "not found");
			}
		System.out.println("UpdateGoldname started");
		return isUpdatedGoldname;
	}
		public static void getChatPrice(){
			
			for(double chatPrice:chatPrices)
				System.out.println("The chat price is: " +chatPrice);
			
		}
		


}