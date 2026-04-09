import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine();

        System.out.println("Нәтиже: " +
                input.replaceAll("[aeiouAEIOUәіөұүӘІӨҰҮ]", "*"));
    }
}