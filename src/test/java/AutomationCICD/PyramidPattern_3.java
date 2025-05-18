package AutomationCICD;

public class PyramidPattern_3 {
    public static void main(String[] args){
        rightHalfPyramid();
        System.out.println("===================");
        reverseRightHalfPyramid();
        System.out.println("===================");
        leftHalfPyramid();

    }

    private static void leftHalfPyramid() {
        
    }

    private static void reverseRightHalfPyramid() {
        for (int i = 5; i> 0; i--){
            for (int j= i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightHalfPyramid() {
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
