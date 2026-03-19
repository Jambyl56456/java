class Computer9 {
    class Processor {
        double frequency;

        Processor(double frequency) {
            this.frequency = frequency;
        }

        void show() {
            System.out.println("Frequency: " + frequency + " GHz");
        }
    }
}

public class Task9 {
    public static void main(String[] args) {
        Computer9 c = new Computer9();
        Computer9.Processor p = c.new Processor(3.5);
        p.show();
    }
}
