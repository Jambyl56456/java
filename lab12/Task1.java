import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouәіөұү".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Дауысты әріптер саны: " + vowels);
        System.out.println("Дауыссыз әріптер саны: " + consonants);
    }
}