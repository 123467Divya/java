class RedChilliesEnterntainmentRunner{


       public static void main(String runner[]){
	   
	   
	    System.out.println("The actor name creation in main started");
		   
		   boolean isCreated=RedChilliesEnterntainment.addMovieActors("Yash");
		   System.out.println("The actors name is added:" +isCreated);
		   isCreated=RedChilliesEnterntainment.addMovieActors("PuneethRaj Kumar");
		   System.out.println("The actors name is added:" +isCreated);
		   isCreated=RedChilliesEnterntainment.addMovieActors("Prajwal Devraj");
		   System.out.println("The actors name is added:" +isCreated);
		   isCreated=RedChilliesEnterntainment.addMovieActors("Sudeep");
		   System.out.println("The actors name is added:" +isCreated);
		   isCreated=RedChilliesEnterntainment.addMovieActors("ShivRajKumar");
		   System.out.println("The actors name is added:" +isCreated);
           isCreated=RedChilliesEnterntainment.addMovieActors("Dhananjay");
		   System.out.println("The actors name is added:" +isCreated);

	   System.out.println("The available actors name are:");
	   RedChilliesEnterntainment.getMovieActorsName();
	   
	   boolean isUpadted = RedChilliesEnterntainment.updateActorName("ShivRajKumar","Nikhil");
	   System.out.println("The actors name is updated:" +isUpadted);
	   System.out.println("The available actors name are:");
	   RedChilliesEnterntainment.getMovieActorsName();
	   
	   
	   boolean isDeleted = RedChilliesEnterntainment.deletedActorName("Sudeep");
	   System.out.println("The actors name is updated:" +isDeleted);
	   System.out.println("The available actors name are:");
	   RedChilliesEnterntainment.getMovieActorsName();
	   

	   System.out.println("The actor name creation in main started");

	   
	   }







}