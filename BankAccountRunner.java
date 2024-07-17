class BankAccountRunner{

   public static void main(String[] bank){
   
   
   System.out.println("main started");
   
      BankAccount.credit(5000);
	  double anyThing = BankAccount.getBalance();
	  System.out.println(anyThing);
      BankAccount.credit(8700.00);
	  anyThing = BankAccount.getBalance();
	  System.out.println(anyThing);
      BankAccount.credit(7400.00);
	  double balance = BankAccount.getBalance();
	  System.out.println(balance);
      BankAccount.credit(940000.00);
	  double bal = BankAccount.getBalance();
	  System.out.println(bal);
     BankAccount.credit(3400000.00);
    double thing =  BankAccount.getBalance();
	  System.out.println(thing);
	  
	  
	  
	  BankAccount.debit(3400.00);
    double Balance =  BankAccount.getBalance();
	  System.out.println(Balance);
   
   System.out.println("main ended");
   }






}