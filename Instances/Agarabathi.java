class Agarabathi{

  String brandName;
     int id;
   int noOfSticks;
  String  fragance;
   double price;
   
  
      /*public void  pooja(){
	   System.out.println("used for pooja");
	   
	   }*/
	   public boolean createDetails(String brandName ,int id,int noOfSticks,String fragance,double price){
		boolean isDetailsCreated=false;
		if(brandName!=null && id>0 && price>0 && noOfSticks>0){
			//instance variables = parameter variables
			this.brandName=brandName;
			this.id=id;
            this.noOfSticks=noOfSticks;
		    this.fragance=fragance;
			this.price=price;
			isDetailsCreated=true;
		}
		return isDetailsCreated;
	}
	public void displayDetails(){
		
		System.out.println("The bramd name is:"+this.brandName);
	    System.out.println("The id is:" +this.id);
        System.out.println("The  no. of sticks are:" +this.noOfSticks);
		System.out.println("The fragance is:" +this.fragance);
		System.out.println("The price is:" +this.price);
		  
		
	}
		

}
	   


