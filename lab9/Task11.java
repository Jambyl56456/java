class Car11 {
    class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            System.out.println("Power: " + power + " HP");
        }
    }
}

public class Task11 {
    public static void main(String[] args) {
        Car11 c = new Car11();
        Car11.Engine e = c.new Engine(150);
        e.show();
    }
}