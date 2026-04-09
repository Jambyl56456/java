import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine();

        int count = input.replace(" ", "").length();
        System.out.println("Бос орынсыз таңбалар саны: " + count);
    }
}