package java_exercises_day1;

import java.util.Scanner;

public class exercise_96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = in.nextDouble();
        in.close();

        if (x >= 5 ){
            System.out.printf("f(x) = " + (2 * x * x + 5*x + 9));
        }else {
            System.out.printf("f(x) = " + (-2 * x * x + 4*x - 9));
        }
    }
}
