  /**
  Congratulations, the answer you gave to problem 7 is correct.

You are the 85787th person to have solved this problem.
  **/
   public class Euler007
   {
      public static void main (String[]args) {
         int tracker = 1;
         int div = 2;
         int num = 3;
         int O = 0;
      
         while (tracker < 10001) 
         {
            while (div < num)
            {
               if (num % div == 0)
               {
                  O++;
               }
               div++;
            }
            if (O == 0)
            {
               System.out.println(num);
               tracker++;
            }    
            num++;
            div = 2;
            O = 0;
         }
      }
   }
