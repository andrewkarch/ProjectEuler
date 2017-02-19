   public class Euler002
   {
      public static void main (String[]args) {
         int x = 1;
         int y = 2;
         int z = 0;
         int total = 2;
         z = x + y;  
         while (z < 4000000) {
            if (z % 2 == 0)
               total = total + z;
            x = y; 
            y = z;
            z = x + y;
         }
         System.out.println(total);
      }
   }