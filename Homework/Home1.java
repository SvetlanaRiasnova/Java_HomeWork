// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("ведите число n: ");
        int n= in.nextInt();
        
        // System.out.print(n);
       
           
             System.out.printf("треугольное число : %d\n", resultNumber(n));
            
     
            in.close();
    }

    public static int resultNumber(int i) {
        return     (i * (i+1))/2;

    }
   

}
