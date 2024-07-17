import java.util.Arrays;

class Goldshop{

     static String name="Malbar Gold and Diamond";
	 static String ownerName="Srinijvas";
	 static String goldItems[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	 static double goldPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	 static int goldItemIndex;
	 static int goldItemPriceIndex;
	 
	 public static boolean addGoldItem(String goldItem){
	 
	     System.out.println("The gold items list is started");
		 boolean isGoldItemAdded=false;
		 
		if(goldItemIndex<goldItems.length){
		    if(goldItem!=null){
			
			goldItems[goldItemIndex]=goldItem;
			goldItemIndex++;
			isGoldItemAdded=true;
			
			}else System.out.println("The gold name is not found ...please provide");
		
		 }else System.out.println("the gold names are full/index is out of bound");
	 
	     System.out.println("The gold items list is ended");
        return isGoldItemAdded;	 
	 
	 }
	 public static boolean getGoldItemPrice(double itemPrice){
	    
		System.out.println("The gold items list is started");
		 boolean isGoldItemPriceAdded=false;
		 
		 if(itemPrice>0){
			 goldPrices[goldItemPriceIndex]=itemPrice;
			 goldItemPriceIndex++;
			 isGoldItemPriceAdded=true;
		 }else System.out.println("The price cannot be zero,please provide valid price");
		 
	    System.out.println("The gold items list is ended");
	return isGoldItemPriceAdded;	 
	 }
	 
	 public static boolean updateGoldItem(String oldGoltItem,String newGoldItem){
	    System.out.println("The updated gold item method is started");
          boolean isGoldItemUpdated=false;
		  
		  for(int index=0;index<goldItems.length;index++){
			  if(oldGoltItem==goldItems[index]){
				  goldItems[index]=newGoldItem;
				  isGoldItemUpdated=true;
			  }
		  }
		  if(isGoldItemUpdated==false){
			  System.out.println(oldGoltItem + "not found");
		  }
 
 
	    System.out.println("The updated gold item method is started");
		return isGoldItemUpdated; 
	 }
	 
	 public static void getGoldItems(){
		 
		 for(String goldItem: goldItems)
			 System.out.println("The gold item is :" +goldItem);
		 	 
	 }
	 public static void getGoldItemPrices(){
		 
		 for(double goldPrice:goldPrices)
			 System.out.println("The gold prices are:" +goldPrice);
		 
	 }
	 public static boolean deleteGoldItem(String goldItemTobeDeleted){
			System.out.println("deleteGymEquipment started");
			boolean isGoldItemDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < goldItems.length;oldIndex++){
		       if(goldItems[oldIndex] != goldItemTobeDeleted )
			   {
				goldItems[newIndex] = goldItems[oldIndex];
			newIndex++;
			   }
			}
	
		goldItems = Arrays.copyOf(goldItems , newIndex);
		if(goldItems != null){
			isGoldItemDeleted = true;
		}
		 if(isGoldItemDeleted = true){
			 System.out.println(isGoldItemDeleted + "not found");
		 }
			
			System.out.println("deleteGymEquipment started");
			return isGoldItemDeleted;
		}


}