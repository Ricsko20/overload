import java.util.Scanner;

public class UserData {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println(user(firstName, lastName, age));
   }

   public static String user(String firstName, String lastName, int age) {
        return firstName + " " + lastName +  " " + Integer.toString(age);
   }
}
