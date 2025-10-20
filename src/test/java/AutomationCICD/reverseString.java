package AutomationCICD;

public class reverseString {
    public static void main(String[] args) {
        String name = "Komal@#$";
        char[] ch = name.toCharArray();
        int s = ch.length;
        char temp;
        int l= 0;
        int R = s-1;

        while(l < R)
        {
           if((ch[R] >= 65 && ch[R] <= 90) || (ch[R] >= 97 && ch[R] <= 122))
           {
                temp = ch[l];
                ch[l] = ch[R];
                ch[R] = temp;
                R--;
                l++;
           }
            else
            {
                R--;

            }
        }
        System.out.println(ch);
    }
}
