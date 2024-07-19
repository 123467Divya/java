//n!/(r! * n-r)

class Ncr{

 public static void main(String ncr[]){
	
 int n = 7;
 int c = 3;
 
    int ncrValue = Factorial.fact(n)/(Factorial.fact(n))*Factorial.fact(n-c);
	System.out.println("result:" + ncrValue);
 }
}