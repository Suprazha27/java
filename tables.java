import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
        sc.close();
    }
}
Enter a number to print its multiplication table: 16
1 x 16 = 16
2 x 16 = 32
3 x 16 = 48
4 x 16 = 64
5 x 16 = 80
6 x 16 = 96
7 x 16 = 112
8 x 16 = 128
9 x 16 = 144
10 x 16 = 160

  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
        sc.close();
    }
}

