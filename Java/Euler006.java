//You are the 100432nd person to have solved this problem.   import java.lang.String;
   public class Euler006
   {
      public static void main (String[]args) {
         int var1 = 0;
         int var2 = 0;
         int tot1 = 0;
      	int tot2 = 0;
      	int x;
         while (var1 <= 100) {
            x = var1 * var1;
         	tot1 = x + tot1;        
            var1++;
         }
        while (var2 <= 100) {
         tot2 = tot2 + var2;
         var2++;
         }
         tot2 = tot2 * tot2;
         System.out.println(tot2 - tot1);
      }
   }
