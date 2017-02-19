   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import javax.swing.event.*;
   import java.io.*;
   import java.util.*;
   import java.lang.String.*;
   public class Euler011 {
      static int Array[][] = new int[20][20];
      static int y = 0;  
      static int x = 0;
      public static void main (String[]args)  throws FileNotFoundException
      {
         Create();
         x = 0;
         y = 0;
         long Total = 0;
         while (y < 20)
         {
            for (x = 0; x<20; x++) {
               if (Total<Down())
                  Total = Down();
               if (Total<Forward())
                  Total = Forward();
               if (Total<DownRight())
                  Total = DownRight();
               if (Total<UpRight())
                  Total = UpRight();
            }
            
            y++; 
         }           System.out.println(Total);
      }
      public static void Create() throws FileNotFoundException {
         Scanner inFile = new Scanner(new FileReader("Euler011.txt"));
         while (y < 20)
         {
            for (x = 0; x<20; x++) {
               int Output = inFile.nextInt();  
               Array[x][y] = Output;
            }
            y++; 
         }  
      }
      public static void Print() {
         int y = 0;
         int x = 0;
         while (y < 20)
         {
            while(x < 20)
            {
               System.out.print(Array[x][y] + " ");
               x++;
            }
            System.out.println();
            x = 0;
            y++;
         }
      }
      public static long Forward() {
         if (x <= 16) {
            int t1, t2, t3, t4;
            t1 = Array[x][y];
            t2 = Array[x+1][y];
            t3 = Array[x+2][y];
            t4 = Array[x+3][y];
            long Out = t1*t2*t3*t4;
            return Out;
         }
         else 
            return 0;
      }
      public static long Down() {
         if (y <= 16) {
            int t1, t2, t3, t4;
            t1 = Array[x][y];
            t2 = Array[x][y+1];
            t3 = Array[x][y+2];
            t4 = Array[x][y+3];
            long Out = t1*t2*t3*t4;
            return Out;
         }
         else 
            return 0;
      }
      public static long  DownRight() {
         if (x <= 16 && y <= 16) {
            int t1, t2, t3, t4;
            t1 = Array[x][y];
            t2 = Array[x+1][y+1];
            t3 = Array[x+2][y+2];
            t4 = Array[x+3][y+3];
            long Out = t1*t2*t3*t4;
            return Out;
         }
         else 
            return 0;
      }
      public static long  UpRight() {
         if (3 <= y && x <= 16) {
            int t1, t2, t3, t4;
            t1 = Array[x][y];
            t2 = Array[x+1][y-1];
            t3 = Array[x+2][y-2];
            t4 = Array[x+3][y-3];
            long Out = t1*t2*t3*t4;
            return Out;
         }
         else 
            return 0;
      }
   }