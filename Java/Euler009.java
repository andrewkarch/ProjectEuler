//You are the 87690th person to have solved this problem.=
   import java.lang.Math;
   public class Euler009 
   {
      public static void main (String[]args)
      {
         int a = 1;
         int b = 1; 
         double c = 1;
         while (a < 10000000){
            if (a == 1000){
               a = 1;
               b++;
               if (b == 1000){
                  b = 1;
                  c++;
               }
            }
            if ((a*a) + (b*b) == (c*c)  && a+b+c == 1000 && a<b && b<c)
               break;
            a++;
         }
         double fina = a*b*c;
         System.out.println(a + ", " + b + ", " + c + " " + (int)fina);
      }
      
   }