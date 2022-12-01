import java.util.ArrayList;

public class Ex013 {

    public ArrayList<Integer> divide(int[] a1, int[] a2) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a2.length; i++) {
            if (a1.length != a2.length) {
                throw new RuntimeException("Длинны массивов не равны");
            }
        }
        if (a1.length == 0 || a2.length == 0) {
            throw new RuntimeException("Один из массивов пуст");
        }

        for (int i = 0; i < a2.length; i++) {
            if (a1[i] != 0 && a2[i] != 0) {
                result.add((a1[i] / a2[i]));

            } else {
                throw new RuntimeException("Деление на ноль");
            }
        }
        System.out.println("Частное двух массивов = " + result);
        return result;
    }
}
