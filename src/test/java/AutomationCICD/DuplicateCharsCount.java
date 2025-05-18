package AutomationCICD;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsCount {
    public static void main(String args[]){
        String input = "PrograMminG";
        findDuplicatechars(input);
    }

    private static void findDuplicatechars(String str) {
        str = str.toLowerCase();
       Map<Character,Integer> CountDuplicatechars = new HashMap<>();
       for (int i = 0; i< str.length(); i++){
           char ch = str.charAt(i);
           CountDuplicatechars.compute(ch,(k,v)->(v==null)? 1 : ++v);
           //key value pair and increasing the value if v is not null

       }
       System.out.println(CountDuplicatechars);
    }
}
