import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int row=scanner.nextInt();
        int column =scanner.nextInt();
        int [][]a=new int[row][column];
        if(row==column){
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if((i+j)%2==0){
                        a[i][j]=1;
                    }else{
                        a[i][j]=0;
                    }
                    System.out.print(a[i][j]+" ");
                }System.out.println("");
            }
        }
        
    }
}
