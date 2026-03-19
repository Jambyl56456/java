class Bank12 {
    static double interestRate = 0.1;

    static double calculate(double amount) {
        return amount * interestRate;
    }
}

public class Task12 {
    public static void main(String[] args) {
        System.out.println(Bank12.calculate(10000));
    }
}