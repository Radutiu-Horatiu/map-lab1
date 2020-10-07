public class Main {

    public static void printArray(int[] array) {
        for (int element: array){
            System.out.print(element + " ");
        }
        System.out.println(' ');
    }

    public static void testProblem1() {
        System.out.println("\nProblem1");

        int [] grades = new int[]{81, 14, 62, 42, 84, 16, 26, 34, 11, 58, 93, 10, 89};

        System.out.println("Grades: ");
        printArray(grades);

        System.out.println("Bad grades: ");
        printArray(Problem1.returnBadGrades(grades));

        System.out.println("Average grade: ");
        System.out.println(Problem1.returnAverageGrade(grades));

        System.out.println("Rounded grades: ");
        printArray(Problem1.returnRoundedGrades(grades));

        System.out.println("Max rounded grades: ");
        System.out.println(Problem1.getMaxGrade(Problem1.returnRoundedGrades(grades)));
    }

    public static void testProblem2() {
        System.out.println("\nProblem2");

        int [] numbers = new int[]{81, 14, 62, 42, 84, 16, 26, 34, 11, 58, 93, 10, 89};

        System.out.println("Max: ");
        System.out.println(Problem2.getMax(numbers));

        System.out.println("Min: ");
        System.out.println(Problem2.getMin(numbers));

        System.out.println("Min sum of n elements: ");
        System.out.println(Problem2.minSumOfElements(numbers, 3));

        System.out.println("Max sum of n elements: ");
        System.out.println(Problem2.maxSumOfElements(numbers, 5));
    }

    public static void testProblem3() {
        System.out.println("\nProblem3");
        int [] x = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int [] y = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};

        int [] a = new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0};
        int [] b = new int[]{5, 4, 0, 0, 0, 0, 0, 0, 0};

        int [] z = new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0};

        System.out.println("Sum test: ");
        printArray(Problem3.sum(x, y));

        System.out.println("Diff test: ");
        printArray(Problem3.diff(a, b));

        System.out.println("Mul test: ");
        printArray(Problem3.mul(z, 2));

        System.out.println("Div test: ");
        printArray(Problem3.div(z, 2));
    }

    public static void testProblem4() {
        System.out.println("\nProblem4");

        Problem4 obj = new Problem4();
        System.out.println("Cheapest keyboard: ");
        System.out.println(obj.getCheapKeyboard());

        System.out.println("Expensive gagdet: ");
        System.out.println(obj.getExpensiveGadget());

        System.out.println("Affordable usb: ");
        System.out.println(obj.getAffordableUsb(80));

        System.out.println("Total price for keyboard+mouse: ");
        System.out.println(obj.shopEconomic(80));
    }

    public static void main(String[] args) {
        testProblem1();
        testProblem2();
        testProblem3();
        testProblem4();
    }
}