   public class Euler003
   {
      public static void main (String[]args) {
         int i = 2;
         long l = 600851475143L;
         int Tracker = 2;
         int O = 0;
         
         while (i < l) {
            if (l % i == 0){
               //Insert loop here
               while (Tracker < i)
               {
                  if(i % Tracker == 0) //92339
                  {
                     O++;
                  }
               
                  Tracker++;
               }
               if (O == 0)
               {
                  System.out.println(i);
               }
            }
            Tracker = 2;
            O = 0;
            i++;
         }
      }
   }
