public class Main {

    public static void main(String args[]) {
        int res = ex01(new int[] { 1, 2, 3, 4, 5, 6 });
        if (res == -1) {
            System.out.println("Слишком большой размер массива");

        }
        System.out.println("что-то еще");
    }

    public static int ex01(int[] arr) {

        final int maxSize = 7;
        if (arr.length >= 7) {
            return -1;

        }
        return arr.length;
    }
}
