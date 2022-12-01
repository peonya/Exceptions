import javax.management.RuntimeErrorException;

public class Main {

    public static void main(String args[]) {
        // 1й метод:
        int res = ex01(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });

        // 2й метод:
        // int res1 = ex02(new int[][] { { 3, 4, 3, 4 }, { 1, 2, 5, 6 }, { 3, 4, 4, 5 },
        // { 2, 1, 2, 1 } });

        // 3й метод:
        // Integer[] res3 = new Integer[] { 1, null, 3, 5, null, 7 };
        // try {
        // ex03(res3);
        // } catch (Exception e) {

        // e.printStackTrace();
        // }

    }

    public static int ex01(int[] arr) {

        final int maxSize = 7;
        if (arr.length > 7) {
            throw new RuntimeException("Массив больше 7, " + " сейчас его длина = " + arr.length);

        } else {
            System.out.println("Все хорошо");

        }
        return arr.length;
    }

    public static int ex02(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                throw new RuntimeErrorException(null, "Массив должен быть квадратным");
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 5) {
                    throw new RuntimeErrorException(null,
                            "Элемент массива не должен превышать 5. Сейчас он = " + arr[i][j] + "." + " Его индекс: ["
                                    + i + "," + j + "]");
                }
            }
        }
        return arr.length;

    }

    public static void ex03(Integer[] arr) throws Exception {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                if (result.equals("")) {
                    result += String.valueOf(i);
                } else {
                    result += ",";
                    result += String.valueOf(i);
                }
            }
        }
        if (!result.equals("")) {
            throw new Exception(" Елементы под индексом: " + result + " равны null");
        }

    }

}
