import javax.management.RuntimeErrorException;

public class Main {

    public static void main(String args[]) {

        int[] array1 = { 1, 2, 3, 1, 5, 6, 7, 8, 9 };
        int[] array2 = { 1, 1, 2, 1, 2, 3, 3, 4, 3 };
        new Ex013().divide(array1, array2);

    }
}