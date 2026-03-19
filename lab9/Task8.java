class University8 {
    class Student {
        String name, major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void show() {
            System.out.println(name + " - " + major);
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        University8 u = new University8();
        University8.Student s = u.new Student("Ali", "IT");
        s.show();
    }
}