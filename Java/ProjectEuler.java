   public class ProjectEuler
   {
      public ProjectEuler(){}
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
      
   	//DIGITSUM RETURNS THE SUM OF ALL THE DIGITS IN THE GIVE NUMBER
      public static int digitSum(long n) {
         String line = String.valueOf(n);
         int i =0;
         int sum = 0;
         while (i<line.length()){
            sum = sum + Character.getNumericValue(line.charAt(i));  
            i++;
         } 
         return sum;
      } 
   	//FINDXPRIME LOOKS FOR THE X PRIME NUMBER 
      public static long findXPrime(int X){
         int Tracker = 0;
         long tracer = 0;
         while (Tracker<=X){
            if (isPrime(tracer)== true)
               X++;
            tracer++;
         
         }
         return tracer;
      
      }
   //dhmo.org
   }
   
