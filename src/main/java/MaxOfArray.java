import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int number;
        int count = 0;
        do {
            System.out.println("Enter the number: ");
            number = scanner.nextInt();
            numbers[count] = number;
            count++;
        } while (count < 20);
        int max = numbers[0];
        int index = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i + 1;
            }
        }
        System.out.printf("The largest property value in the list is %d, at position %d!", max, index);
    }
}
