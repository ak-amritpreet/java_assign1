import java.util.Scanner;

public class third3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PALINDROMEcount = 0;
        int NONpalindromeCOUNT = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            boolean isPalindrome = isPalindrome(input);
            System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");

            if (isPalindrome) {
                PALINDROMEcount++;
            } else {
                NONpalindromeCOUNT++;
            }
        }

        System.out.println("Palindrome count: " + PALINDROMEcount);
        System.out.println("Non-palindrome count: " + NONpalindromeCOUNT);

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
