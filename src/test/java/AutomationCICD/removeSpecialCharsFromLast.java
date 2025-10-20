package AutomationCICD;

public class removeSpecialCharsFromLast {
    public static void main(String[] args) {
        String str = "Aytb#%&==hdfg&^^)hdgGhdG#$@^";
        char[] ch = str.toCharArray();
        int size;
        StringBuilder sb = new StringBuilder(str);
        for(int i = ch.length-1; i > 0; i--) {
            if (Character.isLetter(ch[i]))
            {
                size = i;
                for (int j = 0; j <= size; j++) {
                    sb.append(ch[j]);
                }
                System.out.print(sb);
                break;
            }

        }


    }
}
