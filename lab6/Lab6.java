import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("№6 Зертханалық жұмыс");
        System.out.println("Вариант нөмірін таңдаңыз (1-15): ");
        int variant = sc.nextInt();

        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        double f = 0;

        switch (variant) {

            // ===== 1 =====
            case 1:
                if (x >= 5)
                    f = x + 7;
                else if (x > 2 && x < 5)
                    f = 5 * x - 6;
                break;

            // ===== 2 =====
            case 2:
                if (x >= 0)
                    f = Math.pow(x, 3) + 5;
                else if (x > -3 && x < 0)
                    f = 3 * Math.pow(x, 4) + 9;
                break;

            // ===== 3 =====
            case 3:
                if (x > 0)
                    f = x + 3.5;
                else if (x >= -4 && x <= 5)
                    f = Math.pow(x, 3) + 6 * x * x - 2;
                break;

            // ===== 4 =====
            case 4:
                if (x >= 1.22)
                    f = 5 * x + 1.7;
                else
                    f = x * Math.cos(x);
                break;

            // ===== 5 =====
            case 5:
                if (x > 5 && x <= 9)
                    f = 5 * x + 1.6;
                else if (x >= 2)
                    f = 3 * x - 7;
                else if (x > 0 && x < 2)
                    f = x * Math.cos(x);
                break;

            // ===== 6 =====
            case 6:
                if (x >= 2.5)
                    f = 3 * x + 5;
                else if (x >= 1.5 && x < 2.5)
                    f = Math.pow(x, 3) + Math.sin(x);
                else
                    f = x * Math.tan(x) - Math.sin(x);
                break;

            // ===== 7 =====
            case 7:
                if (x >= 1)
                    f = 5 * Math.sin(x) - 9;
                else if (x > 0 && x < 1)
                    f = 3 * Math.pow(x, 2) + 4 * Math.cos(x);
                break;

            // ===== 8 =====
            case 8:
                if (x > 0 && x < 2)
                    f = 5 * x * Math.cos(x);
                else if (x > -5 && x < 0)
                    f = Math.pow(x, 3);
                break;

            // ===== 9 =====
            case 9:
                if (x > 2)
                    f = 1.7 * x + 7;
                else if (x >= 1 && x <= 2)
                    f = x + 6 * Math.sin(x);
                else if (x > 0 && x < 1)
                    f = x * Math.cos(x) + Math.sin(x);
                break;

            // ===== 10 =====
            case 10:
                if (x > 2 && x <= 6)
                    f = Math.tan(x) + Math.cos(x) + 3.5;
                else if (x > 0)
                    f = x * Math.sin(x) + x + 1.2;
                break;

            // ===== 11 =====
            case 11:
                if (x > 4)
                    f = Math.log(x) + 3 * x + 7;
                else if (x > 0 && x <= 4)
                    f = Math.sin(x) + x + 6;
                break;

            // ===== 12 =====
            case 12:
                if (x > 2 && x <= 6)
                    f = Math.cos(x) + Math.tan(x);
                else if (x > 0 && x <= 2)
                    f = 1.7 * x + Math.sin(x);
                break;

            // ===== 13 =====
            case 13:
                if (x > 3 && x <= 5)
                    f = Math.exp(x) + Math.exp(2 * x);
                else if (x > 1 && x <= 3)
                    f = Math.sin(5 * x) * (1 + x * Math.log(x));
                break;

            // ===== 14 =====
            case 14:
                if (x > 1 && x <= 4)
                    f = Math.tan(3 * x) + Math.log(5 * x);
                else if (x >= -1 && x <= 1)
                    f = x * x - x;
                break;

            // ===== 15 =====
            case 15:
                if (x > 3 && x <= 7)
                    f = 1.5 * x + Math.exp(Math.log(x));
                else if (x > 1 && x <= 3)
                    f = x * Math.sin(x) + Math.log(x);
                break;

            default:
                System.out.println("Қате вариант!");
                sc.close();
                return;
        }

        System.out.println("f(x) = " + f);

        sc.close();
    }
}