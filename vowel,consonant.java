import java.util.Scanner;
class Main {
    public static void print()
	{
	    char ch='c';
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }
    }
	public static void main(String[] args) {
		Main obj=new Main();
		obj.print();
	}
}
c is a Consonant.
