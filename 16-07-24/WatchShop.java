
import java.util.Arrays;
class WatchShop{

     static String shopName="Fashion Addict";
	 static String ownerName=" Deepa";
	 static String watchBrands[]={null,null,null,null,null,null,null,null,null,null};
	 static int watchBrandIndex;
	 static double watchPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	 static int watchPriceIndex;
	 
	 public static boolean createWatchBrandNames(String watchName){
	 
	 System.out.println("The watch names are started to add");
	  boolean isWatchNameAdded=false;
	 if(watchBrandIndex<watchBrands.length){
	     if(watchName!=null){
		    watchBrands[watchBrandIndex]=watchName;
			watchBrandIndex++;
			isWatchNameAdded=true;
		 }else System.out.println("watch name is full,please provide");
	 
	 
	 }else System.out.println("watch name is full/index should be less than array length");	
	 
	  System.out.println("The watch names are ended");
	  
	  return isWatchNameAdded;
 
	 }
	 public static boolean updateWatchBrands(String oldWatchBrand,String newWatchBrand){
		 
		 System.out.println("The update is started ");
		 boolean isWatchBrandUpdated=false;
		 
		 for(int index=0;index<watchBrands.length;index++){
			 if(oldWatchBrand==watchBrands[index]){
				 watchBrands[index]=newWatchBrand;
				 isWatchBrandUpdated=true;
			 }
		 }
		 if(isWatchBrandUpdated==false){
			 System.out.println(oldWatchBrand + "not found");
		 }
		 		 
        System.out.println("The update is ended ");

		return isWatchBrandUpdated; 
	 }
	 
	 public static boolean getWatchPrice(double watchPrice){
		 System.out.println("The price main is started");
		 boolean isWatchPriceAdded=false;
		 if(watchPrice>0){
			 watchPrices[watchPriceIndex]=watchPrice;
			 watchPriceIndex++;
			 isWatchPriceAdded=true;
		 }else System.out.println("The price should not be zero");
	     
		 System.out.println("The price main is started");
		 
		return isWatchPriceAdded;
	 
	 }
	 public static void getWatchNames(){
	 
	     for(String watchName:watchBrands)
		 System.out.println("The watch names are :" +watchName);
	 }
	 public static void getWatchPrices(){
	 
	     for(double watchPrice:watchPrices)
		 System.out.println("The watch names are :" +watchPrice);
	 }
	 
	 public static boolean deleteWatch(String watchTobeDeleted){
			System.out.println("deleteGymEquipment started");
			boolean isWatchDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < watchBrands.length;oldIndex++){
		       if(watchBrands[oldIndex] != watchTobeDeleted )
			   {
				watchBrands[newIndex] = watchBrands[oldIndex];
			newIndex++;
			   }
			}
	
		watchBrands = Arrays.copyOf(watchBrands , newIndex);
		if(watchBrands != null){
			isWatchDeleted = true;
		}
		 if(isWatchDeleted = true){
			 System.out.println(isWatchDeleted + "not found");
		 }
			
			System.out.println("deleteGymEquipment started");
			return isWatchDeleted;
		}




}