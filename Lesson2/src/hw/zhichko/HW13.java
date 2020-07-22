package hw.zhichko;

public class HW13 {
    public static void main(String[] args) {
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них
        int num[] = new int[]{7, 9, 11, 2, 6, 8, 1, 3};
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
        System.out.println("Максимальное число в масиве = " + max);
    }
}
