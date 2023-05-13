// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;

public class Home4001 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(generateNumber());
        }
        System.out.println(numbers);

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers.getLast() + ", ");
            numbers.removeLast();

        }
    }

    public static int generateNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}