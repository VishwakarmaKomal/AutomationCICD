package AutomationCICD;

import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args){
     printTable();
    }
    public static void printTable(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for generating multiplication Table: ");
        int n = input.nextInt();
        int i=1;
        while(i <= 10){
            System.out.println(n + " * "+ i+" = "+(n*i));
            i++;
        }
    }
}
