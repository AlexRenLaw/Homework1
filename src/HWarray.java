import java.util.Arrays;

public class HWarray {
    public static void main(String[] args) {
        /*Дан массив целых чисел. Массив не отсортирован, числа могут повторяться. Необходимо найти в данном
         * массиве такие два числа n и m, чтобы их сумма была равна 7
         * например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7
         * {3,4,5,2,7,12} найти наиболее оптимальным способом
         * */
    int[] arr ={3, 4, 5, 12, 7, 12};
    Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; ++i){
            sum = sum + arr[0] + arr[1];
            System.out.println(sum);
            sum = 0;
            }


        }



    }
}
