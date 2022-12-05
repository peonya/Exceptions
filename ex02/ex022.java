public class ex022 {

    public static void secondTask() {

        int d = 1;
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

        // if (d != 0) {
        // double catchedRes1 = intArray[8] / d;
        // System.out.println("catchedRes1 = " + catchedRes1);
        // } else {
        // throw new ArithmeticException("Catching exception: divided by zero");

        // }
    }

}
