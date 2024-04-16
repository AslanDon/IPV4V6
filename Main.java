import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите что будете искать 1) IPV4 или 2) IPV6");
        int vibor = input.nextInt();
        if(vibor == 1){
            Scanner input1 = new Scanner(System.in);
            String ipv4 = input1.nextLine();
            Pattern p = Pattern.compile("\\b(25[^0-5]\\.|2[0-4]\\d\\.|1\\d\\d\\.|\\d\\d?\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)\\b");
            Matcher m = p.matcher(ipv4);
            System.out.print("Найденный IP: ");
            while (m.find())
            {
                System.out.print(m.group());
            }
        }
        else if (vibor == 2) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Введите данные: ");
            String ipv6 = input2.nextLine();
            Pattern p = Pattern.compile("\\b(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,5}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,1}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,4}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,2}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,3}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,3}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,2}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,4}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,1}[0-9a-fA-F]{1,4}\\b|" +
                    "[0-9a-fA-F]{0,4}::[0-9a-fA-F]{0,4}");
            Matcher m = p.matcher(ipv6);
            System.out.println("Найденный IP: ");
            while (m.find())
            {
                System.out.print(m.group());
            }

        }
    }
}