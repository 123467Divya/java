class Mixer {

	public static void getDetails() {
		System.out.println("getDetails started");
		String name = "Videocon";
		double price = 6000.00;
		System.out.println("The brand name is : " +name);
		System.out.println("The price of mixer : "+price); 
		System.out.println("getDetails ended ");
	
	return;
	}
	static boolean isConnected = false;
	
	public static void onOrOff() {
		System.out.println("onOrOff started");
		if(isConnected == false) {
			isConnected = true;
			System.out.println("Mixer is onn");
		}else if(isConnected == true){
			isConnected =false;
			System.out.println("mixer  is off");
		}
	
		System.out.println("onOrOff ended");
	return;
	} 
	static int currentSpeed;
	static int maximumSpeed = 5;
	static int minimumSpeed;
	
	public static void increaseSpeed(){
		System.out.println("increaseSpeed started");
		if(isConnected==true){
			if(currentSpeed< maximumSpeed){
				currentSpeed = currentSpeed +1;
				System.out.println(currentSpeed);	
			}else{
				System.out.println("maximum Speed reached");
			}
		}else{
			System.out.println("onn the Videocon");
			
		}	
		System.out.println("increaseSpeed ended");
		return;	
	}
	
	
	public static void decreaseSpeed(){
		System.out.println("decreaseSpeed started");
		if(isConnected==true){
			if(currentSpeed> minimumSpeed){
				currentSpeed = currentSpeed -1;
				System.out.println(currentSpeed);	
			}else{
				System.out.println("decreaseSpeed reached");
			}
		}else{
			System.out.println("onn the mixer");
			
		}	
		System.out.println("decreaseSpeed ended");
		return;	
	}


}