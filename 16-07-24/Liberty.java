
import java.util.Arrays;
class Liberty{

     static String name="Shree Bar and Restorent";
	 static String ownerName="Shreedevi";
	 static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	 static double shoePrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	 static int shoeBrandIndex;
	 static int shoePriceIndex;
	 
	 public static boolean addShoeBrands(String shoeBrand){
	 
	     System.out.println("The shoebrand list is started");
		 boolean isShoeBrandAdded=false;
		 
		if(shoeBrandIndex<shoeBrands.length){
		    if(shoeBrand!=null){
			
			shoeBrands[shoeBrandIndex]=shoeBrand;
			shoeBrandIndex++;
			isShoeBrandAdded=true;
			
			}else System.out.println("The shoe name is not found ...please provide");
		
		 }else System.out.println("the shoe names are full/index is out of bound");
	 
	     System.out.println("The shoe name list is ended");
        return isShoeBrandAdded;	 
	 
	 }
	 public static boolean addShoePrice(double shoePrice){
	    
		System.out.println("The shoe price list is started");
		 boolean isShoePriceAdded=false;
		 
		 if(shoePrice>0){
			 shoePrices[shoePriceIndex]=shoePrice;
			 shoePriceIndex++;
			 isShoePriceAdded=true;
			 
		 }else System.out.println("The price cannot be zero,please provide valid price");
		 
	    System.out.println("The winr price is ended");
	return isShoePriceAdded;	 
	 }
	 
	 public static boolean updateShoeBrand(String oldShoeBrand,String newShoeBrand){
	    System.out.println("The updated shoebrand method is started");
          boolean isShoeNameUpdated=false;
		  
		  for(int index=0;index<shoeBrands.length;index++){
			  if(oldShoeBrand==shoeBrands[index]){
				 shoeBrands[index]=newShoeBrand;
				 isShoeNameUpdated=true;
			  }
		  }
		  if(isShoeNameUpdated==false){
			  System.out.println(oldShoeBrand + "not found");
		  }
 
 
	    System.out.println("The updated shoebrand method is ended");
		return isShoeNameUpdated; 
	 }
	 
	 public static void getAllShoeBrands(){
		 
		 for(String shoeBrand: shoeBrands)
			 System.out.println("The shoe brand is :" +shoeBrand);
		 	 
	 }
	 public static void getAllShoePrices(){
		 
		 for(double shoePrice:shoePrices)
			 System.out.println("The shoe prices are:" +shoePrice);
		 
	 }
	 public static boolean deleteShoeBrand(String shoeBrandTobeDeleted){
			System.out.println("deleteGymEquipment started");
			boolean isShoesBrandDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < shoeBrands.length;oldIndex++){
		       if(shoeBrands[oldIndex] != shoeBrandTobeDeleted )
			   {
				shoeBrands[newIndex] = shoeBrands[oldIndex];
			newIndex++;
			   }
			}
	
		shoeBrands = Arrays.copyOf(shoeBrands , newIndex);
		if(shoeBrands != null){
			isShoesBrandDeleted = true;
		}
		 if(isShoesBrandDeleted = true){
			 System.out.println(isShoesBrandDeleted + "not found");
		 }
			
			System.out.println("deleteGymEquipment started");
			return isShoesBrandDeleted;
		}


}