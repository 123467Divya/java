class ChatshopRunner{

     public static void main(String[] shop){
	 
	 System.out.println("main started");
	
	 boolean chatNameAdded=Chatshop.createChatName("Panipuri");
	 System.out.println("is chat name added: "+chatNameAdded);
	 /*boolean priceAdded = Chatshop.createChatName("40.0");
	 System.out.println("is chat price added: " +priceAdded);*/
	 
	 
	  chatNameAdded=Chatshop.createChatName("bhel puri");
	 System.out.println("is chat name added: "+chatNameAdded);
	 /*priceAdded = Chatshop.createChatName("40.0");
	 System.out.println("is chat price added: " +priceAdded);*/
	  
	 
	 
	  chatNameAdded=Chatshop.createChatName("Dahi puri");
	 System.out.println("is chat name added: "+chatNameAdded);
	 /*priceAdded = Chatshop.createChatName("40.0");
	 System.out.println("is chat price added: " +priceAdded);*/
	  
	 
	 
	  chatNameAdded=Chatshop.createChatName("Golguppa");
	 System.out.println("is chat name added: "+chatNameAdded);
	 /*priceAdded = Chatshop.createChatName("40.0");
	 System.out.println("is chat price added: " +priceAdded);*/
	  
	 
	  chatNameAdded=Chatshop.createChatName("Masalapuri");
	 System.out.println("is chat name added: "+chatNameAdded);
	 /*priceAdded = Chatshop.createChatName("40.0");
	 System.out.println("is chat price added: " +priceAdded);*/
	  
	 
	  chatNameAdded=Chatshop.createChatName("Sev puri");
	 System.out.println("is chat name added: "+chatNameAdded);
	  /*priceAdded = Chatshop.createChatName("40.0");
	 System.out.println("is chat price added: " +priceAdded);*/

	    Chatshop.getDetails();
		
		       /*boolean ChatNameUpdated = Chatshop.updateChatName("Golguppa","Kachori");
			   System.out.println("is chat name updated: " +ChatNameUpdated);
			     Chatshop.getDetails();*/
			   
			   boolean chatNameDeleted = Chatshop.deleteChatName("Golguppa");
			   System.out.println("is Chat name deleted " +chatNameDeleted);
			   Chatshop.getDetails();
		
		System.out.println("main started");
		
	 }

}