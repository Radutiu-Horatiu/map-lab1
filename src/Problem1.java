public class Problem1 {

    public static int [] returnBadGrades(int[] grades) {

        int [] badGrades = new int[grades.length];
        int size = 0;

        for (int grade: grades) {
            if (grade < 38) {
                badGrades[size] = grade;
                size += 1;
            }
        }

        return badGrades;
    }

    public static double returnAverageGrade(int[] grades) {

        double sum = 0;

        for (int grade: grades) {
            sum += grade;
        }

        return sum/grades.length;
    }

    public static int [] returnRoundedGrades(int[] grades) {

        int [] roundedGrades = new int[grades.length];
        int size = 0;

        for (int grade: grades) {
            if (grade < 38) {
                roundedGrades[size] = grade;
            }
            else if (5 - grade%10 < 3){
                if (5 - grade%10 < 0)
                    roundedGrades[size] = grade + 5 - Math.abs(5 - grade%10);
                else
                    roundedGrades[size] = grade + Math.abs(5 - grade%10);
            }
            else {
                roundedGrades[size] = grade;
            }

            size += 1;
        }

        return roundedGrades;
    }

    public static int getMaxGrade(int[] grades) {

        int maxGrade = grades[0];

        for (int grade : grades) {
            if (grade > maxGrade)
                maxGrade = grade;
        }

        return maxGrade;
    }

}