import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
 

public class Home3001 {
  
        public static int[] randomArr() {
            Random rand = new Random();
            int array1[] = new int[10];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = rand.nextInt(10);
                System.out.print(array1[i] + " ");
            }
           System.out.println("");
            return array1;
        }


        public static void main(String[] args) {
            int[] array1 = randomArr();
            int[] result = mergesort(array1);
            System.out.println(Arrays.toString(result));
    }
 
    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        
        int mid = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, mid);
        int[] sorted2 = mergesortInner(buffer1, buffer2, mid, endIndex);
        
        int index1 = startIndex;
        int index2 = mid;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < mid && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < mid) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
        
    
