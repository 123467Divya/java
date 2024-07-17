class FlipkartRunner {

	public static void main(String[] runner){
		
		System.out.println("The main is started");
	
		boolean isDetails=Amazon.createAccount("divya2001@gmail.com",8764937292L,"Divya",
		"Divya@23","Divya@23");
		System.out.println("the details are:"+isDetails);
		Amazon.getDetails();
		
		System.out.println("The main is ended");
	
	
	}





}