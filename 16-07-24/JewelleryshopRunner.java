class GoldshopRunner{

     public static void main(String[] shop){
	 
	 System.out.println("main started");
	
	 boolean goldNameAdded=Goldshop.createGoldName("Ring");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	 boolean goldNameAdded=Goldshop.createGoldName("Nechless");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	 boolean goldNameAdded=Goldshop.createGoldName("Ear ring");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	 boolean goldNameAdded=Goldshop.createGoldName("Hand Chain");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	 boolean goldNameAdded=Goldshop.createGoldName("Nosepin");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	 boolean goldNameAdded=Goldshop.createGoldName("Antick ear ring");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	 boolean goldNameAdded=Goldshop.createGoldName("Neck chain");
	 System.out.println("is gold name added: "+goldNameAdded);
	 
	    Goldshop.getDetails();
		
		       boolean GoldNameUpdated = Goldshop.updateGoldName("Antick ear rin","Maati");
			   System.out.println("is gold name updated: " +GoldNameUpdated);
			     
			   
			   Goldshop.getDetails();
		
		System.out.println("main started");
		
	 }

}