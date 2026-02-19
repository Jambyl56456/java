import java.util.Scanner;

public class lab5 {

    public static double calculateFunction(double x) {
        if (x >= 2.5) {
            return 3 * x + 5;
        } else if (x >= 1.5 && x < 2.5) {
            return Math.pow(x, 3) + Math.sin(x);
        } else {
            return x * Math.tan(x) - Math.sin(x);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сан енгізіңіз: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Бұл оң сан.");
        } else if (number < 0) {
            System.out.println("Бұл теріс сан.");
        } else {
            System.out.println("Сан нөлге тең.");
        }

        System.out.print("Апта күнінің нөмірін енгізіңіз (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("Дүйсенбі"); break;
            case 2: System.out.println("Сейсенбі"); break;
            case 3: System.out.println("Сәрсенбі"); break;
            case 4: System.out.println("Бейсенбі"); break;
            case 5: System.out.println("Жұма"); break;
            case 6: System.out.println("Сенбі"); break;
            case 7: System.out.println("Жексенбі"); break;
            default: System.out.println("Қате сан енгізілді!");
        }

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                continue;
            }

            System.out.println(numbers[i]);

            if (numbers[i] == 40) {
                break;
            }
        }

        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();

        double result = calculateFunction(x);

        System.out.println("f(x) = " + result);

        scanner.close();
    }
}