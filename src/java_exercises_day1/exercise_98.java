package java_exercises_day1;

import java.util.Scanner;

public class exercise_98 {
    public static void main(String[] args) {

        int a1, b1, c1, a2, b2, c2;
        double D, Dx, Dy, x, y;

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a1 = ");
        a1 = in.nextInt();
        System.out.print("Nhập b1 = ");
        b1 = in.nextInt();
        System.out.print("Nhập c1 = ");
        c1 = in.nextInt();
        System.out.print("Nhập a2 = ");
        a2 = in.nextInt();
        System.out.print("Nhập b2 = ");
        b2 = in.nextInt();
        System.out.print("Nhập c2= ");
        c2 = in.nextInt();


        in.close();

        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;

        if (D == 0) {
            if (Dx + Dy == 0){
                System.out.printf("phương trình có vô số nghiệm");
                System.exit(0);
            }
            else{
                System.out.printf("phương trình vô nghiệm");
                System.exit(0);
            }
        }
        else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("phương trình có nghiệm (x, y) = (%.1f, %.1f)", x, y);
            System.exit(0);
        }
    }
}
