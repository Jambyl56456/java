class University15 {
    static int studentCount = 0;

    University15() {
        studentCount++;
    }
}

public class Task15 {
    public static void main(String[] args) {
        new University15();
        new University15();
        System.out.println("Total students: " + University15.studentCount);
    }
}