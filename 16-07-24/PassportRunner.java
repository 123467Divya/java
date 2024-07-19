class PassportRunner{


      public static void main(String[] args){
	  
	   //className.MethodName(13)
	   
	   boolean isPassportDataCreated=Passport.createPassport("PO",8,"Divya","Divyashree","23/08/2001","divya2328@gmail.com",true,
	   "divya2328@gmail","divya1234","divya1234","color","Pink","AhgOy");
	 
		 Passport.getDetailsPassport();
		 
		 System.out.println("is Passport Created :" + isPassportDataCreated);
	  }







}