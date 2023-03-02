package java_exercises_day1;

import java.util.Scanner;

public class exercise_97 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = in.nextInt();
        System.out.print("Nhập b: ");
        int b = in.nextInt();
        System.out.print("Nhập c: ");
        int c = in.nextInt();
        in.close();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giác cân");
            } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.println("Tam giác vuông");
            } else if (a*a + b*b < c*c || a*a + c*c < b*b || b*b + c*c < a*a) {
                System.out.println("Tam giác tù");
            } else {
                System.out.println("Tam giác nhọn");
            }
        } else {
            System.out.println("Đây không phải là tam giác");
        }
    }
}
