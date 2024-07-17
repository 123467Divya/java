class AirConditioner {

	public static void getDetails() {
		System.out.println("getDetails started");
		String name = "samsung";
		int price = 7000;
		System.out.println("The brand name is : " +name);
		System.out.println("The price of ac : "+price); 
		System.out.println("getDetails ended ");
	
	return;
	}
	/*static boolean isConnected = false;
	
	public static void onOrOff() {
		System.out.println("onOrOff started");
		if(isConnected == false) {
			isConnected = true;
			System.out.println("air conditioner is onn");
		}else if(isConnected == true){
			isConnected =false;
			System.out.println("air conditioner is off");
		}
	
		System.out.println("onOrOff ended");
	return;
	} */
	
	
	static boolean isConnected = false;
	
	public static void onOrOff() {
		           System.out.println("onOrOff started");
	               isConnected=(isConnected==false)?  true : false;
	               System.out.println("onOrOff");
	            return ;
      }
	
	
	static int currentTemp;
	static int maximumTemp = 5;
	static int minimumTemp;
	
	public static void increaseTemperature(){
		System.out.println("increaseTemperature started");
		if(isConnected==true){
			if(currentTemp< maximumTemp){
				currentTemp = currentTemp +1;
				System.out.println(currentTemp);	
			}else{
				System.out.println("maximum temperature reached");
			}
		}else{
			System.out.println("onn the ac");
			
		}	
		System.out.println("increaseTemperature ended");
		return;	
	}
	
	
	public static void decreaseTemperature(){
		System.out.println("decreaseTemperature started");
		if(isConnected==true){
			if(currentTemp> minimumTemp){
				currentTemp = currentTemp -1;
				System.out.println(currentTemp);	
			}else{
				System.out.println("minimum temperature reached");
			}
		}else{
			System.out.println("onn the ac");
			
		}	
		System.out.println("decreaseTemperature ended");
		return;	
	}


}