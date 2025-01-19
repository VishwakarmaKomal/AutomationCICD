package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.println("Hello and welcome!");

        String s= "Komal Vishwakarma";
        char a[] = s.toLowerCase().toCharArray();
        int l = a.length;


        for(int i= 0; i< l; i++){
            int k = 0;

                for (int j = i+1; j < l; j++) {
                    if (a[i] == a[j] && a[i] !=' ') {
                        k++;
                        a[j]=0;
                    }


            }
            if(k > 0 && a[i] != ' ')
                System.out.println(a[i]);
        }
    }
}