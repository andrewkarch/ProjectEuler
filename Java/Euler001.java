/**
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 
and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

Completed on 5/29/11
I was the 147,944th person to complete this problem
**/

   public class Euler001
   {
      public static void main (String[] args) {
         int Total = 0;
         for (int Tracker = 1; Tracker < 1000; Tracker++)
         {
            if(Tracker % 3 == 0 || Tracker % 5 == 0)
               Total += Tracker;
         }
         System.out.println(Total);
      }
   }