import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine();

        System.out.print("Қай сөзден басталсын: ");
        String word = sc.nextLine();

        System.out.println("Нәтиже: " + input.startsWith(word));
    }
}