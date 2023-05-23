import java.util.Scanner;

public class first1 {
    public static void main(String[] args) {
        Scanner flying = new Scanner(System.in);

        System.out.println("Enter three float numbers separated by space: ");
        String input = flying.nextLine();

        String[] numbers = input.split("\\s+");
        float max = Float.parseFloat(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            float THEnumber = Float.parseFloat(numbers[i]);
            if (THEnumber > max) {
                max = THEnumber;
            }
        }

        System.out.println("The maximum number is: " + max);

        flying.close();
    }
}
