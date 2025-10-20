package AutomationCICD;

class course {

    String courseName;
    int enrollments;
    static int maxCapacity = 100;
    String[] enrolledStudent;

    course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new String[maxCapacity];
    }

    void enrolledStudents(String studentName){
        enrolledStudent[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " enrolled");
    }

    void unenrolledStudents(String studentName){
        System.out.println(studentName + " unenrolled");
        enrollments--;
    }

    static void maxCapacity(int maxCapacity){
       course.maxCapacity = maxCapacity;
    }

    public static void main(String args[]){
        course newcourse  = new course("BCA");
        newcourse.enrolledStudents("Keshav Raj");

    }
}
