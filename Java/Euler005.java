//You are the 97973rd  person to have solved this problem.
   import java.lang.String;
   public class Euler005
   {
      public static void main (String[]args) {
         int var1 = 1;
         int var2 = 0;
         while (var2 == 0) {
            if (var1 % 2 == 0 &&var1 % 3 == 0 && var1 % 4 == 0 && var1 % 5 == 0 && var1 % 7 == 0 && var1 % 8 == 0 && var1 % 9 == 0 && var1 % 10 == 0 &&var1 % 11 == 0 && var1 % 12 == 0 && var1 % 13 == 0 && var1 % 14 == 0 && var1 % 15 == 0 && var1 % 16 == 0 && var1 % 17 == 0 && var1 % 18 == 0 && var1 % 19 == 0 && var1 % 20 == 0)
            {
               System.out.println(var1);
               break;
            }
         var1++;
         }
      }
   }
