
class Course14 {
    String courseName = "Java";

    class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void show() {
            System.out.println(name + " studies " + courseName);
        }
    }
}

public class Task14 {
    public static void main(String[] args) {
        Course14 c = new Course14();
        Course14.Student s = c.new Student("Dana");
        s.show();
    }
}