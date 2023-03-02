package java_day1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        /*// bài 2: Nhập 2 số nguyên (long) x và y. In ra trung bình công của 2 số đó.
        //Gợi ý: nextLong()

        long x,y;

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("nhập x = ");
        x = scanner1.nextLong();
        System.out.print("nhập y = ");
        y = scanner1.nextLong();

        double tbc = (x + y) / 2.0;

        System.out.printf("tbc la %.2f" ,tbc);*/

        /*float x,y,z;

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("nhập x = ");
        x = scanner1.nextFloat();
        System.out.print("nhập y = ");
        y = scanner1.nextFloat();
        System.out.print("nhập z = ");
        z = scanner1.nextFloat();

        scanner1.close();

        double nhan = x * y * z;
        // căn 3 = 1/3
        double canbac3 =  (1.0/3);
        double tbn =  Math.pow(nhan,canbac3);

        System.out.printf("tbn la %.3f" ,tbn);  */

        // nhập vào số nguyên a và b từ bàn phím , in ra thương và số dư của a / b;

        /*int x,y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập x = ");
        x = scanner.nextInt();
        System.out.print("nhập y = ");
        y = scanner.nextInt();

        float sodu = x % y;
        System.out.printf("sodu = " + sodu);*/

        // tính giá trị của biểu thức A = (2x + 5) and  (3y < 10) or (5z + 6 > t)

        int  x, y ,z ,t;

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập x = ");
        x = scanner.nextInt();
        System.out.print("nhập y = ");
        y = scanner.nextInt();
        System.out.print("nhập z = ");
        z = scanner.nextInt();
        System.out.print("nhập t = ");
        t = scanner.nextInt();

        scanner.close();

        boolean A = (2*x > 5) && (3*y < 10 ) || (5*z + 6 > t);

        System.out.printf("A = " + A);

    }
}
