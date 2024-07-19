class SunGlasses{

	String	name;
	int	id;
	String type;
	double	price;


	public boolean createSunglassesDetails(String name,int id,String type,double price){
	
		boolean isSunGlassesDataCreated = false;
		if(name!=null&&id>=0&&price>=0.0&&type!=null){
		this.name=name;
		this.id = id;
		this.type=type;
		this.price=price;
		isSunGlassesDataCreated=true;
		}else	System.out.println("please enter correct details");
	
	return isSunGlassesDataCreated;
	}
	
	
	public void dispalyInfo(){
	
		System.out.println("The name of SunGlasses is: "+this.name);
		System.out.println("The id of SunGlasses is : "+this.id);
		System.out.println("The type of SunGlasses is : "+this.type);
		System.out.println("The price of SunGlasses is : "+this.price);
	
	return;
	}
	
	
}