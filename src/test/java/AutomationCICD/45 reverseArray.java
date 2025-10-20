package AutomationCICD;

class reverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reversing of Array\n");
        int[] numArray = ArrayUtility.arrayInput();
        int[] revArray = arrayReverse(numArray);
        System.out.println("Reversed Array is : ");
        ArrayUtility.displayArray(revArray);

    }
    public static int[] arrayReverse(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2){
            int revSwap = numArr[i];
            numArr[i] = numArr[(numArr.length -1)- i];
            numArr[(numArr.length - 1) - i] = revSwap;
            i++;
        }
        return numArr;
    }
}
