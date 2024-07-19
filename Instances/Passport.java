class Passport{


      String cpvLocation;
	  int dcdrLocation;
	  String surName;
	  String givenName;
	  String dob;
	  String email;
	  boolean emailloginSame;
	  String loginId;
	  String password;
	  String confirmPassword;
	  String hintQues;
	  String hintAns;
	  String captcha;
	  
	  
	  public Passport(){
	  
	  }

     public static boolean createPassport(String cpvLocation,int dcdrLocation,String surName,
	 String givenName,String dob,String email,boolean emailloginSame,String loginId,String pwd,
	 String confirmPwd,String hintQues,String hintAns,String captcha  ){
		   boolean isPassportDataCreated = false;
		   
		   /*if(dcdrLocation>0 && surName!=null && givenName!=null &&  dob!=null && email!=null && 
		   loginId!= null && pwd!=null && confirmPwd!=null && hintQues!= null
		  && hintAns!=null && captcha!=null)*/{
			  
			  System.out.println("Passport Creation");
			  boolean cpvrLocationValid = false;
	             if(cpvLocation != null){
				 this.cpvLocation      = cpvLocation;
				 cpvrLocationValid = true;
				 }else{
					 System.out.println("provide valid dcdrLocation");
				 }
				 if(dcdrLocation >0){
                 this.dcdrLocation=   dcdrLocation;
				 dcdrLocationValid = true;
				 }else{
					 System.out.println("provide valid dcdrLocation");
				 }
				 if(surName !=null){
				   this.surName    = surName;
				 }else{
					 System.out.println("provide valid dcdrLocation");
				 }
				 if(givenName!=null){
					this.givenName = givenName;
				 }
				 else{
					 System.out.println("provide valid dcdrLocation");
				 }
					
					dateOfBir= dob;
					eml = email;
					els = emailloginSame;
					lgId =loginId;
					pswd =pwd;
					cnfmPwd=confirmPwd;
					hntQues=hintQues;
					hntAns=hintAns;
					capt= captcha;
					isPassportDataCreated= true;
					System.out.println("Passport Creation Successfully Created......");
		  }
		else{
						System.out.println("Please......provide the proper Details");
		    }
					System.out.println("Passport Creation ended.....");
		  
		   
		return isPassportDataCreated; 
	 }
	 
	   public static void getDetailsPassport(){
		   System.out.println("The cpvLocation is:" +cpvLoc);
		   System.out.println("The dcdrLocation is:" +dcdrLoc);
		   System.out.println("The surName is:" +surNm);
		   System.out.println("The givenName is:" +givenNm);
		   System.out.println("The Date of birth is:" +dateOfBir);
		   System.out.println("The  email  is:" +eml);
		   System.out.println("Is email and loginId  is same:" +els);
		   System.out.println("The loginId is:" +lgId);
		   System.out.println("The password is:" +pswd);
		   System.out.println("The Confirm password is:" +cnfmPwd);
		   System.out.println("The hint question is:" +hntQues);
		   System.out.println("The hint answer is:" +hntAns);
		   System.out.println("The Captcha is:" +capt);
		   
	   }           
	 
	 
	 
	 
	

}