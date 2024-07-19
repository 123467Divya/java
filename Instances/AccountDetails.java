class AccountDetails{

         int   customerId;
		String	bankName;
		String	branchName;
		String	ifscCode;
		long	accountNumber;
		String	address;
		String	accountType;
		String holderName;
		
		
		public AccountDetails(){
		
		
		}
		
		
		public boolean createAccount(int   customerId,String	bankName,
		String	branchName,String	ifscCode,long	accountNumber,
		String address,String	accountType,String holderName){
		 boolean isAccountCreated = false;
		 if(customerId>0 && bankName != null && branchName !=null && 
		 ifscCode!= null &&  accountNumber>0 && address!=null &&
		 accountType!=null && holderName!=null){
		 
		 this.customerId = customerId;
		 this. bankName=bankName;
		 this. branchName=branchName;
		 this.ifscCode=ifscCode;
		 this.accountNumber=accountNumber;
		 this.address=address;
		 this.accountType=accountType;
		 this.holderName=holderName;
		 isAccountCreated = true;
		 }else{
			 System.out.println("please enter the valid details");
		 } 
		 return isAccountCreated;
		}	
      
	  public void getDetails(){
		  
		  System.out.println("the customer Id is:"+this.customerId);
		  System.out.println("the customer bankName is:"+this.bankName);
		  System.out.println("the customer branchName is:"+this.branchName);
		  System.out.println("the customer ifscCode is:"+this.ifscCode);
		  System.out.println("the customer accountNumber is:"+this.accountNumber);
		  System.out.println("the customer address is:"+this.address);
		  System.out.println("the customer accountType is:"+this.accountType);
		  System.out.println("the  holderName is:"+this.holderName);
		  
	  }

		
}
