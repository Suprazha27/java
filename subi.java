import java.util.Scanner;
public class userInputExample {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
        System.out.println("HEllo, " + name);
        scanner.close();
    }}
Output
Enter your name:subi
Hello,subi
