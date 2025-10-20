package AutomationCICD;

public class sortArray {
    public static void main(String[] args) {
        int[] a = {21,2,45,20,15};
        int len = a.length;
        int temp;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
