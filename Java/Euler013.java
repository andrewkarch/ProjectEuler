   //61160th Person
   import java.math.*;
   import java.awt.event.*;
   import javax.swing.*;
   import javax.swing.event.*;
   import java.io.*;
   import java.util.*;
   import java.lang.String.*;
   public class Euler013 
   {
      public static void main (String[]args) throws FileNotFoundException
      {
         BigInteger Output = new BigInteger("0");
         Scanner inFile = new Scanner(new FileReader("Euler013.txt"));
         String line = inFile.nextLine();
         while (inFile.hasNext()) {
            BigInteger temp = new BigInteger(line);
            System.out.println(temp);
            Output = Output.add(new BigInteger(line));
            line = inFile.nextLine();
         }
         BigInteger temp = new BigInteger(line);
            System.out.println(temp);
            Output = Output.add(new BigInteger(line));

         System.out.print(Output);
      }
   }