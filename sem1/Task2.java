import java.util.Currency;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 1, 0, 1, 1}; 
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        else {
            count= 0;
        }
        if (max < count) {
            max = count;
        };
      };
      System.out.printf("Максимальное количество подряд идущих единиц : %d\n",max);
    }
}
    
    

