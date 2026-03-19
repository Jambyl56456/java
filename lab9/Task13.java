class Company13 {
    class Employee {
        String name, position;

        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void show() {
            System.out.println(name + " - " + position);
        }
    }
}

public class Task13 {
    public static void main(String[] args) {
        Company13 c = new Company13();
        Company13.Employee e = c.new Employee("Ali", "Manager");
        e.show();
    }
}