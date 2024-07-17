class GymRunner{

   public static void main(String[] runner){
   
   
      System.out.println("The main method is started");
	  
	  boolean isCreated=Gym.createGymEquipment("Dumbelles");
	  System.out.println("the equipment name is:" +isCreated);
	  isCreated=Gym.createGymEquipment("Power rack");
	  System.out.println("the equipment name is:" +isCreated);
      isCreated=Gym.createGymEquipment("Treadmill");
	  System.out.println("the equipment name is:" +isCreated);
	  isCreated=Gym.createGymEquipment("Stair Master");
	  System.out.println("the equipment name is:" +isCreated);
	  isCreated=Gym.createGymEquipment("Spin Bike");
	  System.out.println("the equipment name is:" +isCreated);
	  isCreated=Gym.createGymEquipment("Ab Roller");
	  System.out.println("the equipment name is:" +isCreated);
	  
	  
	  
	  

	  
	 System.out.println("The available gym equipments are");
	  	  Gym.getDetails();
		  
		  boolean gymNameUpdated = Gym.updateGymEquipment("Dumbelles","Running cycle");
			   System.out.println("is gym name updated: " +gymNameUpdated);
			     
			   
			   Gym.getDetails();
			   
			   boolean gymEquipmentDeleted = Gym.deleteGymEquipment("Treadmill");
		          System.out.println("is gym name deleted: " +gymEquipmentDeleted);
                  Gym.getDetails();

   System.out.println("The main method is ended");
   
   
   }



}