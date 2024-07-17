class Addition{


public static void main(String add[]){
//local
  add(78 , 98, 67);
  add (97,54 , 43);
  
  }
  //declaration of a method  (used outside the main method , adv : code reuse)
  
  public static void add(int num1 , int num2, int num3){
  
  System.out.println(num1 + num2 + num3);
  return ;
  }
  }