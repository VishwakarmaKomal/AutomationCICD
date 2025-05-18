package AutomationCICD;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

class Swap {
  public static void main(String[] args){
   /*int a= 5;
   int b=10;
   int c;
   System.out.println("Before Swapping the numbers: \n" +"a= "+a +"\nb= "+b);*/
   Scanner input =  new Scanner(System.in);
   System.out.println("Enter the value for A: ");
   int a = input.nextInt();
   System.out.println("Enter the value for B: ");
   int b = input.nextInt();

   int c = a;
   a= b;
   b= c;
   System.out.println("After Swapping the numbers: \n" + "A = "+a+"\nB = "+b);
  }
}
