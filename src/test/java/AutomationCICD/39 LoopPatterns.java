package AutomationCICD;

import java.util.Scanner;

class LoopPatterns {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Loop Patterns");
        System.out.println("Please enter number of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        System.out.println("===================");
        printLeftHalfPyramid(rows);
        System.out.println("Here is Right Half Pyramid with space");
        printRightHalfPyramidWithSpace(rows);
    }

    public static void printRightHalfPyramid(int maxRows){
        int rows = 0;
        while(rows < maxRows){
            System.out.print("*");
            int  i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void printLeftHalfPyramid(int maxRows){
        while(maxRows > 0){
            int i= 0;
            while(i < maxRows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            maxRows--;
        }
    }
    public static void printRightHalfPyramidWithSpace(int maxRows){
        int rows= maxRows;
        while(rows > 0){
            //loop for printing space
            int j = 0;
            while(j < rows-1){
                System.out.print("  ");
                j++;
            }

      //loop for printing stars
            int  i = 0;
            while(i <=(maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

}
