public class Problem3 {

    public static int [] sum(int[] x, int[] y) {
        int [] result = new int[x.length + 1];

        for (int i = x.length - 1; i >= 0 ; i--) {
            int addResult = x[i] + y[i];
            result[i + 1] += addResult;

            if (result[i + 1] > 9) {
                result[i] += 1;
                result[i + 1] = result[i + 1]%10;
            }
        }

        return result;
    }

    public static int [] diff(int[] x, int[] y) {
        int [] result = new int[x.length + 1];

        for (int i = x.length - 1; i >= 0 ; i--) {
            int diffResult = x[i] - y[i];
            result[i + 1] = diffResult;

            if (result[i + 1] < 0) {
                x[i - 1] -= 1;
                result[i + 1] = 10 - Math.abs(diffResult);
            }
        }

        return result;
    }

    public static int [] mul(int[] x, int y) {

        int [] result = new int[x.length + 1];

        for (int i = x.length - 1; i >= 0 ; i--) {
            int addResult = x[i] * y;
            result[i + 1] += addResult;

            if (result[i + 1] > 9) {
                result[i] += 1;
                result[i + 1] = result[i + 1]%10;
            }
        }

        return result;
    }

    public static int [] div(int[] x, int y) {

        int [] result = new int[x.length];
        int rest = 0;

        for (int i = 0; i < x.length; i++) {
            int d = x[i];
            if (rest > 0)
                d = rest * 10 + x[i];
            if (x[i]/y > 0) {
                // if result of division is a number > 10 we must spread the number on the array
                if (d/y > 10) {
                    int number = d/y;
                    int index = i;
                    while (number > 0) {
                        result[index] = number%10;
                        number /= 10;
                        index -= 1;
                    }
                }
                else
                    result[i] = d/y;
                rest = d%y;
            }
            else
                rest = d;
        }

        return result;
    }
}