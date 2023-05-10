//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Home3003 {
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<>();
        Random rNumbers = new Random();
        for (int i = 0; i < 10; i++) {
            allNumbers.add(rNumbers.nextInt(20));
        }
        System.out.println(allNumbers);

       
                
        int min = allNumbers.get(0);
        int max = allNumbers.get(0);
        float sum = 0;
        for (int i = 0; i < allNumbers.size(); i++) {
            int num = allNumbers.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = sum / allNumbers.size();

        System.out.println("Минимальное значение: " + min);

        System.out.println("Максимальное значение: " + max);

        System.out.println("Среднее арифметическое значение: " + average);
    }
      
}
