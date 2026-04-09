import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Ең ұзын сөз: " + longest);
    }
}