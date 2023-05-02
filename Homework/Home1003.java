import java.util.Scanner;

public class Home1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char operation;
        operation = in.next().charAt(0);
        int res;
        if (operation == '+') {
                res = a + b;
                System.out.printf("Результат: %d",res);
        }
        if (operation == '-') {
                res = a - b;
                System.out.printf("Результат: %d",res);
        }    
        if (operation == '/') {
                res = a / b;
                System.out.printf("Результат: %d",res);
        }
        if (operation == '*') {
                res = a * b;
                System.out.printf("Результат: %d",res);
        }
        in.close();
    }
}
