class BankAccount{
         static double balance = 5000.00;
    public static void credit(double amount){
	System.out.println("credit started");
	balance=balance+amount;
	System.out.println("credit ended");
	return;
	
	}
	public static void debit(double amount){
	System.out.println("Debit started");
	if(amount <= balance)
	
	 balance=balance-amount;
	else
	System.out.println("Insufficient funds....");
	
	System.out.println("Debit ended");
	return ;
	}
	public static double getBalance(){
	System.out.println("balance fetching...");
	return balance;
	
	}
	






}