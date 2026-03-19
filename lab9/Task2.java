class Student2 {
    String name;
    static String university = "ATU";

    Student2(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " - " + university);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Student2 s = new Student2("Ali");
        s.show();
    }
}