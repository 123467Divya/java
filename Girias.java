
import java.util.Arrays;
class Girias{
         
	static String name="GiriasSales";
	static String ownerName="Sri";
	static String homeAppliances[]={null,null,null,null,null,null};
	static int homeAppliancesIndex;
	
	public static boolean createHomeAppliance(String applianceName){
	
		 System.out.println("The create equipment method is started");
		 boolean isHomeAppliancesCreated=false;
		 if(applianceName!=null){
		 //arrayvariable = variable name
		 homeAppliances[homeAppliancesIndex]=applianceName;
		 homeAppliancesIndex++;
		 isHomeAppliancesCreated=true;
		 
		 }else System.out.println("The ApplianceName not found,please provide");

    System.out.println("The create equipment method is started");

	return isHomeAppliancesCreated;
	
	
	}
	public static void getApplianceName(){
	
	for(String applianceName:homeAppliances)
	System.out.println(applianceName);
	
	
	}
		  
public static boolean deleteHomeAppliance(String HomeApplianceTobeDeleted){
			System.out.println("homeAppliances started");
			boolean isHomeApplianceDeleted = false;
			int newIndex , oldIndex;
			for(newIndex = 0, oldIndex = 0; oldIndex < homeAppliances.length;oldIndex++){
		       if(homeAppliances[oldIndex] != HomeApplianceTobeDeleted )
			   {
				homeAppliances[newIndex] = homeAppliances[oldIndex];
			newIndex++;
			   }
			}
	
		homeAppliances = Arrays.copyOf(homeAppliances , newIndex);
		if(homeAppliances != null){
			isHomeApplianceDeleted = true;
		}
		 if(isHomeApplianceDeleted = true){
			 System.out.println(isHomeApplianceDeleted + "not found");
		 }
			
			System.out.println("homeAppliances started");
			return isHomeApplianceDeleted;
		}








}