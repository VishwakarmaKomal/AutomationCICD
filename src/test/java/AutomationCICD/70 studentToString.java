package AutomationCICD;

class studentToString {

    String name;
    int age;
    String rollNumber;
    String house;

    public studentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "student Details{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", house='" + house + '\'' +
                '}';
    }

    public static void main(String[] args) {
        studentToString obj1 = new studentToString("Komal",28,"018","Green");
        System.out.println(obj1);

    }
}
