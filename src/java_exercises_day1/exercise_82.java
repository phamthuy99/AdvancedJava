package java_exercises_day1;

import java.util.Scanner;

public class exercise_82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = in.nextDouble();
        System.out.print("Nhập y: ");
        double y = in.nextDouble();
        System.out.print("Nhập z: ");
        double z = in.nextDouble();

        in.close();

        if (x > y && x > z){
            System.out.printf(x + " là số lớn nhất");
            System.exit(0);
        }else if (y > z){
            System.out.printf(y + " là số lớn nhất");
            System.exit(0);
        }
        System.out.printf(z + " là số lớn nhất");
    }
}
