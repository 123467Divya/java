class Flipkart {

	static String emailaddress;
	static long mobileno;
	static String fullName;
	static String pwd;
	static String confirmPwd;
	
	static boolean isEmailAddressValid,isMobileNumValid,isFullNameValid,isPasswordValid,
	isConfirmPwdValid;

	public static boolean createAccount(String email,long mobileNumber,String name,
	String password,String confirmPassword){
		boolean isAccountRegistered = false;
		
		boolean isEmailAddressValid=false;
		boolean isMobileNumValid=false;
		boolean isFullNameValid=false;
		boolean isPasswordValid=false;
		boolean isConfirmPwdValid=false;
		
	
	if(email!=null){
		
		emailaddress = email;
		isEmailAddressValid=true;	
	}else{
		System.out.println("Please..enter valid  name");
	}
	if(mobileNumber>0){
		
		mobileno = mobileNumber;
		isMobileNumValid=true;	
	}else{
		System.out.println("Please..enter valid contact num");
	}
	if(name!=null){
		
		fullName = name;
		isFullNameValid=true;	
	}else{
		System.out.println("Please..enter valid registerationNum");
	}
	if(password!=null){
		
		pwd = password;
        isPasswordValid=true;	
	}else{
		System.out.println("Please..enter valid Address");
	}
	if(confirmPassword!=null){
		
		confirmPwd = confirmPassword ;

		isConfirmPwdValid=true;	
	}else{
		System.out.println("Please..enter valid emailid");
	}
	if( isEmailAddressValid&&isMobileNumValid&&isFullNameValid&&isPasswordValid&&isConfirmPwdValid){
		isAccountRegistered = true;
		
	}else{
		isAccountRegistered = false;
		  System.out.println("please enter valis details");
		
	}
	
	
	return isAccountRegistered ;
	}
	
	public static void getDetails() {
		
		System.out.println("email addresss : "+emailaddress);
		System.out.println("mobile number : "+mobileno);
		System.out.println("full name : "+fullName);
		System.out.println("password : "+pwd);
		System.out.println("confirm Password : "+confirmPwd);
		
		
	}
	

}