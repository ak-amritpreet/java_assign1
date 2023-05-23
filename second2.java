import java.util.Scanner;

public class second2 {
    public static void main(String[] args) {
        Scanner docx = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = docx.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = docx.nextLine();

        int length = str1.length();
        System.out.println("Length of the first string: " + length);

        String concatenated = str1.concat(str2);
        System.out.println("Concatenated string: " + concatenated);

        String reversedStr1 = reverseString(str1);
        System.out.println("Reversed first string: " + reversedStr1);

        String reversedStr2 = reverseString(str2);
        System.out.println("Reversed second string: " + reversedStr2);

        docx.close();
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
