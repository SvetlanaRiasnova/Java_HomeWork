//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Home3002 {
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<>();
        Random rNumbers = new Random();
        for (int i = 0; i < 20; i++) {
            allNumbers.add(rNumbers.nextInt(50));
        }
        System.out.println(allNumbers);

        for (int i = allNumbers.size()-1; i >= 0; i--) {
            int even = allNumbers.get(i) % 2;
            if (even == 0) {
                allNumbers.remove(i);
            }
        }
        System.out.println("Список без четных чисел: \n " + allNumbers);
    }
}
