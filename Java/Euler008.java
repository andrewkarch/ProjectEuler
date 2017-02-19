 //Congratulations, the answer you gave to problem 8 is correct.

//You are the 87424th person to have solved this problem.

//8, 15, 17

//<32
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import javax.swing.event.*;
   import java.io.*;
   import java.util.*;
   import java.lang.String.*;
   public class Euler008 
   {
      public static void main (String[]args) throws FileNotFoundException
      {
         Scanner inFile = new Scanner(new FileReader("Euler008.txt"));
         String line = inFile.nextLine();
         int Length = line.length();
         int Output = 0;
         String Test = line.substring(0, 5);
         for (int i = 0; i <= Length-5; i++){
            Test = line.substring(i, i+5);
            String T1 = Test.substring(0, 1);
            int R1 = Integer.parseInt(T1);
            String T2 = Test.substring(1, 2);
            int R2 = Integer.parseInt(T2);
            String T3 = Test.substring(2, 3);
            int R3 = Integer.parseInt(T3);
            String T4 = Test.substring(3, 4);
            int R4 = Integer.parseInt(T4);
            String T5 = Test.substring(4, 5);
            int R5 = Integer.parseInt(T5); 
            int Final = R1*R2*R3*R4*R5;
            if (Final > Output)
               Output = Final;
         }
         System.out.println(Output);
      }
   }