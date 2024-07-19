class AmusementPark{

     String name;
	 int gardenId;
	 String place;
	 int noOfGames;
	 
	/*public void gettingFreshAir(){
	     
		 System.out.println("The enjoyment is filled with this gardens ");
	}*/
	
	public boolean createParkDetails(String name ,int gardenId,String place,int noOfGames){
		boolean isDetailsCreated=false;
		if(name!=null && gardenId>0 && place!=null && noOfGames>0){
			//instance variables = parameter variables
			this.name=name;
			this.gardenId=gardenId;
			this.place=place;
			this.noOfGames=noOfGames;
			isDetailsCreated=true;
		}
		return isDetailsCreated;
	}
	public void displayDetails(){
		
		System.out.println("The property name is:"+this.name);
		System.out.println("The  home stay id is:" +this.gardenId);
		System.out.println("The owner name is:" +this.place);
        System.out.println("The no.of rooms are:" +this.noOfGames);
		  
		
	}
		

}