//You are the 87000th person to have solved this problem.
	import java.lang.String;
   public class Euler004
   {
      public static void main (String[]args) {
         int var1 = 1;
         int var2 = 1;
         int r = 0;
         int q;
         int w;
         int tot = 0;
         String s;
         while (var1 <= 1000)
         {
         //Begins at 0
            while (var2 <= 1000){
               r = var1 * var2;
               s = String.valueOf(r);
               q = s.length();
               if (q == 6 && s.charAt(0) == s.charAt(5) && s.charAt(1) == s.charAt(4) && s.charAt(2) == s.charAt(3)) {
                  if (r >= tot)
                  {
                     tot = r;
                  }
               }
               var2++;
            }
            var1++;
            var2 = var1;
         }
      System.out.println(tot);
      }
   }
