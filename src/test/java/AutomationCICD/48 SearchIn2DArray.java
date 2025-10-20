package AutomationCICD;

import java.util.Scanner;

class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Array Search");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Now Enter the number you want to search: ");
        int n = input.nextInt();
        boolean isFound = search(numArr,n);
        if(isFound){
            System.out.println("number is found");
        }
        else {
            System.out.println("Number not found");
        }

    }

    public static boolean search(int[][] arr, int num){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
