import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern1 = "[0-9]{1,}_*";
        String pattern2 = ".{8,}";
        String pattern3 = "[A-Z]{1,}";
        String pattern4 = "[a-z]{1,}";


        String text = scanner.nextLine();

        Pattern p1 = Pattern.compile(pattern1);
        Pattern p2 = Pattern.compile(pattern2);
        Pattern p3 = Pattern.compile(pattern3);
        Pattern p4 = Pattern.compile(pattern4);


        Matcher m1 = p1.matcher(text);
        Matcher m2 = p2.matcher(text);
        Matcher m3 = p3.matcher(text);
        Matcher m4 = p4.matcher(text);


        if (m1.find() && m2.find() && m3.find() && m4.find()) {
            System.out.println("Пароль надежен");
        } else {
            System.out.println("Пароль ненадежен. Повторите ввод");
        }
        scanner.close();
    }

}


