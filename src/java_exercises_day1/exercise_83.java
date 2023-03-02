package java_exercises_day1;

import java.util.Scanner;

public class exercise_83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = in.nextDouble();
        System.out.print("Nhập y: ");
        double y = in.nextDouble();

        in.close();

        if (x * y > 0){
            System.out.printf("cùng dấu");
            System.exit(0);
        }else if (x * y < 0){
            System.out.printf("khác dấu");
            System.exit(0);
        }else {
            System.out.printf("không hợp lệ");
        }
    }
}
