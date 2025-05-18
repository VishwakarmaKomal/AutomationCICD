package AutomationCICD;

public class Exercise {

        public static void main(String args[]){
            int numbers[] = {4,5,6,7,8};
            System.out.println("The first element of array is " +numbers[0]);
            System.out.println("Last element of array is "+ numbers[4]);

            for (int i= numbers.length-1; i>=0; i--){
                System.out.println(numbers[i]);
            }
            System.out.println("total number of element in array is :"+ numbers.length);
        }
    }

