class GiriasRunner{

     public static void main(String runner[]){

    System.out.println("The chat name creation in main started");
	
	boolean isCreated=Girias.createHomeAppliance("Television");
		  System.out.println("the equipment name is:" +isCreated);
		  
		  isCreated=Girias.createHomeAppliance("Refrigerator");
		  System.out.println("the equipment name is:" +isCreated);
		  
		  isCreated=Girias.createHomeAppliance("AC Cooler");
		  System.out.println("the equipment name is:" +isCreated);
		  
		  isCreated=Girias.createHomeAppliance("Mixer");
		  System.out.println("the equipment name is:" +isCreated);
		  
		  isCreated=Girias.createHomeAppliance("Grinder");
		  System.out.println("the equipment name is:" +isCreated);
		  
		  
		  isCreated=Girias.createHomeAppliance("Cell Phones");
		  System.out.println("the equipment name is:" +isCreated);
		  

   
   Girias.getApplianceName();
   
   boolean isDeleted = Girias.deleteHomeAppliance("Grinder");
		          System.out.println("is homeappliancse name deleted: " +isDeleted);
                  Girias.getApplianceName();

System.out.println("The homeappliancse are:");
    }






}