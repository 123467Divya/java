class Speaker {

	public static void getDetails() {
		System.out.println("getDetails started");
		String name = "Jbl";
		int price = 4000;
		System.out.println("The brand name is : " +name);
		System.out.println("The price of ac : "+price); 
		System.out.println("getDetails ended ");
	
	return;
	}
	static boolean isConnected = false;
	
	public static void onOrOff() {
		System.out.println("onOrOff started");
		if(isConnected == false) {
			isConnected = true;
			System.out.println("Speaker is onn");
		}else if(isConnected == true){
			isConnected =false;
			System.out.println("Speaker  is off");
		}
	
		System.out.println("onOrOff ended");
	return;
	} 
	static int currentVolume;
	static int maximumVolume = 5;
	static int minimumVolume;
	
	public static void increaseVolume(){
		System.out.println("increaseVolume started");
		if(isConnected==true){
			if(currentVolume< maximumVolume){
				currentVolume = currentVolume +1;
				System.out.println(currentVolume);	
			}else{
				System.out.println("maximum Volume reached");
			}
		}else{
			System.out.println("onn the Jbl");
			
		}	
		System.out.println("increaseVolume ended");
		return;	
	}
	
	
	public static void decreaseVolume(){
		System.out.println("decreaseVolume started");
		if(isConnected==true){
			if(currentVolume> minimumVolume){
				currentVolume = currentVolume -1;
				System.out.println(currentVolume);	
			}else{
				System.out.println("decreaseVolume reached");
			}
		}else{
			System.out.println("onn the Speaker");
			
		}	
		System.out.println("decreaseVolume ended");
		return;	
	}


}