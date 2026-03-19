class Student1 {
    String name;
    int age;
    static int count = 0;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}

public class Task1 {
    public static void main(String[] args) {
        new Student1("Ali", 18);
        new Student1("Dana", 19);
        System.out.println(Student1.count);
    }
}