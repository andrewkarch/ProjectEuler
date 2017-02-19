//Congratulations, the answer you gave to problem 12 is correct.
//You are the 54463rd person to have solved this problem.
   import java.lang.Math.*;
   public class Euler012 {
      public static void main (String[]args){ 
         String Andrew = "Cool";
         long Num = 3;
         long Run = 0;
         while (Andrew == "Cool"){
            if (500 < (Count(Sum(Num)))){
               System.out.println(Sum(Num));
               break;
            }
            Num++;
            Run++;
         }
         
         System.out.println("Runs: " + Run);
      }
      public static int Count(long n) {
         if (isPrime(n) == false){
            int tracker = 2;
            int count = 2;
            while (tracker < Math.sqrt(n)){
               if (n%tracker == 0) {
                  count++;
                  count++;
               }
               tracker++;
            }
            return count;
         }
         else 
            return 2;
      }
   	
      public static long Sum(long n) {
         long Sum = n;
         long Total = 0;
         while (Sum != 0) {
            Total = Total + Sum;
            Sum--;
         }
         return Total;
      }
   	
      public static boolean isPrime(long n) {
         if(n < 2) 
            return false;
         if(n == 2 || n == 3) 
            return true;
         if(n%2 == 0 || n%3 == 0) 
            return false;
         long sqrtN = (long)Math.sqrt(n)+1;
         for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) 
               return false;
         }
         return true;
      }
   }