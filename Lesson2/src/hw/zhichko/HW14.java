package hw.zhichko;

public class HW14 {
    public static void main(String[] args) {
//        Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера
        int num[] = new int[]{7, 9, 11, 2, 6, 8, 1, 3};
        int imax = 0, max = num[0], imin = 0, min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                imax = i;
            }
            if (num[i] < min) {
                min = num[i];
                imin = i;
            }
        }
        System.out.println("Минимальное значение = " + min + ". Индекс в массиве данного числа = " + imin);
        System.out.println("Максимальное значение = " + max + ". Индекс в массиве данного числа = " + imax);



    }
}
