public class methoddemo{
    int add(int a,int b){
        return b+a;
    }
    int sub(int a,int b){
        return b-a;
    }
    int mul(int a,int b){
        return b*a;
    }
    int div(int a,int b){
        return b/a;
    }
public static void main(String[] args) {
    methoddemo obj=new methoddemo ();
    System.out.println(obj.add(20,50));
    System.out.println(obj.sub(20,50));
    System.out.println(obj.mul(20,50));
    System.out.println(obj.div(20,50));
}
}
70
30
1000
2
