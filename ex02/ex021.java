import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить 
//к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class ex021 {

    public static void user() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите дробное число:");

        if (input.hasNextFloat()) {
            System.out.println(input.nextFloat());

        } else {
            System.out.println("Вы ввели неверный формат числа: " + input.next());
            user();

        }
        input.close();

    }
}
