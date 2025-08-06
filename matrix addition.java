import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] a = new int[row][column];
        int sum = 0;
        System.out.println("Enter elements of matrix:");
        for (int i=0;i<row;i++) {
            for (int j=0;j<column;j++) {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            } }

        System.out.println("Sum of elements in the matrix is: "+sum);
        System.out.println();
    }
}
Enter Rows and Columns:
4
4
Enter elements of matrix:
1 2 3 4
5 6 7 8 
9 10 11 12
13 14 15 16
Sum of elements in the matrix is: 136

