
import java.util.Arrays;
class RedChilliesEnterntainment{

   static String name="Movie Hangama";
	static String ownerName="Sri";
	static String movieActors[]={null,null,null,null,null,null};
	static int movieActorsIndex;
	
	public static boolean addMovieActors(String actorName){
	
	System.out.println("The create equipment method is started");
    boolean isActorsNameAdded=false;
	if(actorName!=null){
	   movieActors[movieActorsIndex]=actorName;
	   movieActorsIndex++;
	   isActorsNameAdded=true;
	  
	}else System.out.println("The Actor name not found ,Please Add Name");
	
		System.out.println("The create equipment method is ended");
    
	return isActorsNameAdded;
	
	
	}
	public static void getMovieActorsName(){
	
	for(String actorName: movieActors)
	System.out.println(actorName);

public static boolean updateActorName(String oldActorName , String newActorName){
		
		System.out.println("updateActorName started");
		    boolean isUpdatedActorname = false;
			
			for(int index=0;index<movieActors.length;index++){
				if(oldActorName == movieActors[index]){
					
				movieActors[index]   = newActorName;
				
				isUpdatedActorname = true;
				}
		
			}
			if(isUpdatedActorname == false){
				
				System.out.println(oldActorName  + "not found");
			}
		System.out.println("updateActorName started");
		return isUpdatedActorname;
	}
	
	}
    public static boolean deletedActorName(String actorNameTobeDeleted){
			System.out.println("deletedActorName started");
			boolean isActorNameDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < movieActors.length;oldIndex++){
		       if(movieActors[oldIndex] != actorNameTobeDeleted )
			   {
				movieActors[newIndex] = movieActors[oldIndex];
			newIndex++;
			   }
			}
	
		movieActors = Arrays.copyOf(movieActors , newIndex);
		if(movieActors != null){
			isActorNameDeleted = true;
		}
		 if(isActorNameDeleted = true){
			 System.out.println(isActorNameDeleted + "not found");
		 }
			
			System.out.println("deletedActorName started");
			return isActorNameDeleted;
		}








}