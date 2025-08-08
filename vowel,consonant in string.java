import java.util.Scanner;
class Main {
    public static void print()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char lowerChar = Character.toLowerCase(ch);
                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                    System.out.println(ch + " is a vowel");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            } else {
                System.out.println(ch + " is not a letter");
            }
        }
	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.print();
	}
}
	Enter a string: suprazha
s is a consonant
u is a vowel
p is a consonant
r is a consonant
a is a vowel
z is a consonant
h is a consonant
a is a vowel
	
	
	
