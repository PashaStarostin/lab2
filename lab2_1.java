import java.util.Scanner;
import java.util.regex.*;


public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "(0[1-9]|[1-2][0-9]|3[0-1])\\/(0[1-9]|1[1-2])\\/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])";
        String text = scanner.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("Введённое выражение является датой");
        } else {
            String patternForElse = "(0[1-9]|[1-2][0-9]|3[0-1]).(0[1-9]|1[1-2]).(19[0-9][0-9]|[2-9][0-9][0-9][0-9])";
            Pattern pForElse = Pattern.compile(patternForElse);
            Matcher mForElse = pForElse.matcher(text);

            if (mForElse.find()) {
                System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            } else {
                System.out.println("Введенное выражение не является датой");
            }

        }

    }
}
