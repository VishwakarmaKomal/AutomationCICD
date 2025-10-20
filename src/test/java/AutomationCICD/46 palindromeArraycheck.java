package AutomationCICD;

class palindromeArraycheck {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome check Array");
        int[] arr = ArrayUtility.arrayInput();
        boolean isPalindrome = isPalindrome(arr);
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            if(arr[i] != arr[(arr.length-1) - i]){
               return false;
            }
           i++;
        }
        return true;
    }
}
