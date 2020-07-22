package hw.zhichko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5 {
    public static void main(String[] args) throws IOException {
//        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//        различны?
        System.out.println("Введите четырехзначное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int []xn = new int[4];
        if (num > 999 && num < 10000) {
            for (int i = 0; i < 4; i++) {
                xn[i] = num % 10;
                num /= 10;
            }

            if (xn[0] == xn[1] && xn[1] == xn[2] && xn[2] == xn[3])
                System.out.println("Цифры чила равны");
            else
                System.out.println("Цифры числа не равны");
        }
        else
            System.out.println("Вы ввели не четырехзначное число!");
    }
}
