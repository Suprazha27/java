import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] arr = new int [rows][columns];
        if(rows==columns) {
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr.length;j++){
                if (i+j==columns-1){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            
        }
        }
        for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
            }
        }
        }
    }
4
4
0 0 0 1  
0 0 1 0  
0 1 0 0  
1 0 0 0  
