// Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Home4002 {
        public static void main(String[] args) {
            LinkedList<Integer> numbers = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(generateNumber());
            }
            System.out.println(numbers);
            System.out.println();
            
            System.out.println("в конец перемещаем " + first(numbers));
            System.out.println("получаем " + last(numbers));
            System.out.println();

            System.out.println("первый элемент, который удаляем " + firstDel(numbers));
            // System.out.println();
            System.out.println("получаем " +numbers);

            System.out.println();
            System.out.println("первый элемент " + first(numbers));
            System.out.println();
        }

        public static LinkedList<Integer> last(LinkedList<Integer> numbers) { 
            int toLast = numbers.get(0);
            numbers.remove(0);
            numbers.addLast(toLast);
            return numbers;
        }
    
        public static int firstDel(LinkedList<Integer> numbers) { 
            int first = numbers.get(0);
            numbers.remove(0);
            return first;
        }
    

        public static int first(LinkedList<Integer> numbers) { 
            int numFirst = numbers.get(0);
            return numFirst;
        }
    
        public static int generateNumber() { 
            double x = (Math.random() * 99);
            int num = (int) x;
            return num;
        }
    }