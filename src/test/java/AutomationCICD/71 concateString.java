package AutomationCICD;

class concateString {
    public static void main(String[] args) {
        String str1 = "Komal";
        String str2 = "Vishwakarma";
        String fullString = str1+" " +str2;
        System.out.println(fullString.toUpperCase());
        String finalName = str1.concat(" ").concat(str2);
        System.out.println(finalName.toUpperCase());

    }
}
