
public class javabasics {
   public static void printHelloWorld() {
         System.out.println("Hello World");
         System.out.println("Hello World");
         System.out.println("Hello World");
    }
   public static void main(String[] args) {  
      printHelloWorld();//function call
   }
}
public static int calculationSum(int num1, int num2){//parameters or formal parameters
    int sum= num1+num2;
    return sum;
} 
public static int multiply(int a, int b){//multiplication
   int product=a*b;
   return product;
}
public static int factorial(int n){
   int f=1;

   for(int i=1;i<=n;i++){
   f=f*i;   
   } 
   return f;//factorial of n
}
//func to calc int sum
public static int sum(int a,int b){
   return a+b; 
} 
//funv to calc float sum
public static float sum(float a, float b){
   return a+b;
}
public static boolean isPrime(int n){
   if (n==2){
      return true;
   }
   for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
         return false;
      }
   }
   return true;
}
public static void primesInRange(int n){
   for(int i=2;i<=n;i++){
      if(isPrime(i)){//true
         System.out.print(i+" ");
      }
    System.out.println();  
   }
}


public static void main(String args[]){
   primesInRange(10);
}






  
   