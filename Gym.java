import java.util.Arrays;

class Gym{
     static String name="Sri Ganapathi Gym Center";
	 static String ownerName="Ganapathi";
	 static String gymEquipments[]={null,null,null,null,null,null};
	 //static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	 static int gymEquipmentIndex;
	 //static int chatpriceIndex;
	 
	 public static boolean createGymEquipment(String gymEquipment){
	 System.out.println("createGymEquipment started");
	 boolean isGymEquipmentCreated=false;
	
	// Create operation
	
	//0<6
	 if(gymEquipmentIndex < gymEquipments.length){
	 if(gymEquipment !=null){
	 
	   gymEquipments[gymEquipmentIndex] = gymEquipment;
	   gymEquipmentIndex++;
	   isGymEquipmentCreated=true;
	 
	 }else System.out.println("Equipment name is null, cannot be added");
	 }else{
		 System.out.println("Equipment names are full....");
	 }
	 
	 System.out.println("createGymEquipment ended");
	 return isGymEquipmentCreated;
	 
	 }
	 
	 /*public static boolean addChatprice(double chatPrice){
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
	
	 System.out.println("The available chats are:");
	 
	 for(String gymEquipment:gymEquipments)
	 
	 
	 System.out.println("The gymEquipments are: "+gymEquipment);

	}
	 
	 
	 //upadated operation
	public static boolean updateGymEquipment(String oldGymEquipment , String newGymEquipment){
		
		System.out.println("updateGymEquipment started");
		    boolean isUpdatedGymEquipment = false;
			
			for(int index=0;index<gymEquipments.length;index++){
				if(oldGymEquipment == gymEquipments[index]){
					
				gymEquipments[index]   = newGymEquipment;
				
				isUpdatedGymEquipment = true;
				}
		
			}
			if(isUpdatedGymEquipment == false){
				
				System.out.println(oldGymEquipment  + "not found");
			}
		System.out.println("updateGymEquipment started");
		return isUpdatedGymEquipment;
	}
		/*public static void getChatPrice(){
			
			for(double chatPrice:chatPrices)
				System.out.println("The chat price is: " +chatPrice);
			
		}*/
		//delete operation
		
		public static boolean deleteGymEquipment(String gymEquipmentTobeDeleted){
			System.out.println("deleteGymEquipment started");
			boolean isGymEquipmentDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < gymEquipments.length;oldIndex++){
		       if(gymEquipments[oldIndex] != gymEquipmentTobeDeleted )
			   {
				gymEquipments[newIndex] = gymEquipments[oldIndex];
			newIndex++;
			   }
			}
	
		gymEquipments = Arrays.copyOf(gymEquipments , newIndex);
		if(gymEquipments != null){
			isGymEquipmentDeleted = true;
		}
		 if(isGymEquipmentDeleted = true){
			 System.out.println(isGymEquipmentDeleted + "not found");
		 }
			
			System.out.println("deleteGymEquipment started");
			return isGymEquipmentDeleted;
		}
}
