import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class ex024 {

    public static void emptyString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String res = input.nextLine();

        if (res.isEmpty()) {

            System.out.println("Ваша строка пуста, просьба повторить ввод: ");
            emptyString();
        } else {
            System.out.println("Ваша строка: " + res);
        }

        input.close();
    }

}
