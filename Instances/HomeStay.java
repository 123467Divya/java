class HomeStay{

	  String propertyName;
	  int homeStayId;
	  String ownerName;
	  String areaInSft;
	  int noOfRooms;
	  
	 /* public void enjoy(){
	       System.out.println("The home stay's are peaceful ");
	  }*/
    public boolean createHomeStayDetails(String propertyName,int homeStayId,String ownerName,String areaInSft,
	int noOfRooms){
		boolean isDetailsCreated=false;
		if(propertyName!=null && homeStayId>0 && ownerName!=null && noOfRooms>0){
			//instance variables = parameter variables
			this.propertyName=propertyName;
			this.homeStayId=homeStayId;
			this.ownerName=ownerName;
			this.areaInSft=areaInSft;
			this.noOfRooms=noOfRooms;
			isDetailsCreated=true;
		}
		return isDetailsCreated;
	}
	public void displayDetails(){
		
		System.out.println("The property name is:"+this.propertyName);
		System.out.println("The  home stay id is:" +this.homeStayId);
		  System.out.println("The owner name is:" +this.ownerName);
		  System.out.println("The sqft is:" +this.areaInSft);
		  System.out.println("The no.of rooms are:" +this.noOfRooms);
		  
		
		
	}


}