import java.util.Arrays;

public class Problem2 {
    public static int getMax(int[] numbers) {

        int maxNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber)
                maxNumber = number;
        }

        return maxNumber;
    }

    public static int getMin(int[] numbers) {

        int minNumber = numbers[0];

        for (int number : numbers) {
            if (number < minNumber)
                minNumber = number;
        }

        return minNumber;
    }

    public static int minSumOfElements(int[] numbers, int n) {
        int sum = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static int maxSumOfElements(int[] numbers, int n) {
        int sum = 0;
        Arrays.sort(numbers);

        int i = numbers.length - 1;
        int times = 0;

        while(times < n) {
            sum += numbers[i];
            i -= 1;
            times += 1;
        }

        return sum;
    }
}