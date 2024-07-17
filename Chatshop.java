import java.util.Arrays;

class Chatshop{
     static String name="Sri Ganapathi Chat Center";
	 static String ownerName="Ganapathi";
	 static String chatNames[]={null,null,null,null,null,null};
	 static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
	 static int chatNameIndex;
	 static int chatpriceIndex;
	 
	 public static boolean createChatName(String chatName){
	 System.out.println("createChatName started");
	 boolean isChatNameCreated=false;
	
	// Create operation
	
	//0<6
	 if(chatNameIndex < chatNames.length){
	 if(chatName !=null){
	 
	   chatNames[chatNameIndex] = chatName;
	   chatNameIndex++;
	   isChatNameCreated=true;
	 
	 }else System.out.println("Chat name is null, cannot be added");
	 }else{
		 System.out.println("Chat names are full....");
	 }
	 
	 System.out.println("createChatName ended");
	 return isChatNameCreated;
	 
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
	 
	 for(String Chatname:chatNames)
	 
	 
	 System.out.println("The chatnames are: "+Chatname);

	}
	 
	 
	 //upadated operation
	public static boolean updateChatName(String oldChatName , String newChatName){
		
		System.out.println("UpdateChatname started");
		    boolean isUpdatedChatname = false;
			
			for(int index=0;index<chatNames.length;index++){
				if(oldChatName == chatNames[index]){
					
				chatNames[index]   = newChatName;
				
				isUpdatedChatname = true;
				}
		
			}
			if(isUpdatedChatname == false){
				
				System.out.println(oldChatName  + "not found");
			}
		System.out.println("UpdateChatname started");
		return isUpdatedChatname;
	}
		public static void getChatPrice(){
			
			for(double chatPrice:chatPrices)
				System.out.println("The chat price is: " +chatPrice);
			
		}
		//delete operation
		
		public static boolean deleteChatName(String chatNameTobeDeleted){
			System.out.println("deleteChatName started");
			boolean isChatNameDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < chatNames.length;oldIndex++){
		       if(chatNames[oldIndex] != chatNameTobeDeleted )
			   {
				chatNames[newIndex] = chatNames[oldIndex];
			newIndex++;
			   }
			}
	
		chatNames = Arrays.copyOf(chatNames , newIndex);
		if(chatNames != null){
			isChatNameDeleted = true;
		}
		 if(isChatNameDeleted = true){
			 System.out.println(isChatNameDeleted + "not found");
		 }
			
			System.out.println("deleteChatName started");
			return isChatNameDeleted;
		}
}
