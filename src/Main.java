import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int[] array = {1, 4, 5, 9, 13, 345, 666, 3, 0, 2121, 344, 46, -6, -100};
            System.out.println("Массив: "+ Arrays.toString(array));
            for (int out = array.length - 1; out >= 1; out--){
                for (int in = 0; in < out; in++){
                    if(array[in] > array[in + 1])
                    {int temp = array[in];
                        array[in] = array[in+1];
                        array[in+1] = temp;}
                }
            }
            System.out.println("Результат сортировки: " + Arrays.toString(array));
        }
    }
