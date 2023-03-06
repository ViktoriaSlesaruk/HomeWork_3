import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int[] array = {1, 4, 5, 9, 13, 345, 666, 3, 0, 2121, 344, 46, -6, -100};
            System.out.println("Массив: "+ Arrays.toString(array));
            for (int out = array.length - 1; out >= 1; out--){  //Внешний цикл
                for (int in = 0; in < out; in++){       //Внутренний цикл
                    if(array[in] > array[in + 1]) // Если порядок сравниваемых переменных нарушен
                    {int temp = array[in];      //во временную переменную помещаем первый элемент
                        array[in] = array[in+1];       //на место первого ставим второй элемент
                        array[in+1] = temp;}
                }
            }
            System.out.println("Результат сортировки: " + Arrays.toString(array));
        }
    }
