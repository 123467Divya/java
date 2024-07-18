class BillRunner{


    public static void main(String[] args){
	
	
	Bill bill = new Bill();
	bill.billId = 21;
	bill.billIssuedDate="21-6-24";
	bill.billDueDate="21-7-24";
	bill.isLatestDate=true;
	bill.isBillPaid=true;
	
	System.out.println("The bill id is:" +bill.billId);
	System.out.println("The bill issue date is:" +bill.billIssuedDate);
	System.out.println("The due bill date is:" +bill.billDueDate);
	System.out.println("The latest bill date is:" +bill.isLatestDate);
	System.out.println("is bill paid:"+bill.isBillPaid);
	
	System.out.println("----------------------");
	
	Bill bill1 = new Bill();
	bill1.billId = 221;
	bill1.billIssuedDate="19-7-24";
	bill1.billDueDate="19-8-24";
	bill1.isLatestDate=true;
	bill1.isBillPaid=true;
	
	System.out.println("The bill id is:" +bill1.billId);
	System.out.println("The bill issue date is:" +bill1.billIssuedDate);
	System.out.println("The due bill date is:" +bill1.billDueDate);
	System.out.println("The latest bill date is:" +bill1.isLatestDate);
	System.out.println("is bill paid:"+bill1.isBillPaid);
	
	
	
	}



}