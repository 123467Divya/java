class Instagram {
	static String emailaddress;
	static long mobileno;
	static String fullName;
	static String pwd;
	static String confirmPwd;

	public static void createAccount(String email,long mobileNumber,String name,String password,String confirmPassword){
		//boolean isAccountRegistered = false;
		emailaddress = email;
		mobileno = mobileNumber;
		fullName = name;
		pwd = password;
		confirmPwd = confirmPassword ;
	
	
	
	return ;
	}
	
	public static void getDetails() {
		
		System.out.println("email addresss : "+emailaddress);
		System.out.println("mobile number : "+mobileno);
		System.out.println("full name : "+fullName);
		System.out.println("password : "+pwd);
		System.out.println("confirm Password : "+confirmPwd);
		
		
	}
	

}