import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine();

        System.out.println("Нәтиже: " + input.replaceAll("[0-9]", ""));
    }
}