import java.util.Scanner;
public class RightAngleNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        for(int i = 1;i <= rows; i++){
            for(int j =1;j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
