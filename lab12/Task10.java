import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Жол енгізіңіз: ");
        String input = sc.nextLine();

        if (input.matches("\\d+"))
            System.out.println("Жол тек цифрлардан тұрады");
        else
            System.out.println("Жол тек цифрлардан тұрмайды");
    }
}