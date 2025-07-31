Program:2 Addition (method 1)

import java.util.Scanner;
public class UserInputExample {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(&quot;Enter first number:&quot;);
int a = input.nextInt();
System.out.print(&quot;Enter second number:&quot;);
int b = input.nextInt();
  int value = a + b;
System.out.println(&quot;The value:&quot; + value);
input.close();
}
}

Output
Enter first number:11
Enter second number:22
The value:33
