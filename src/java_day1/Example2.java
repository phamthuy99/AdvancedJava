package java_day1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // bài 1: nhập 2 số nguyên a,b từ bàn phím sau đó in ra tổng của chúng
        int a , b;

        Scanner scanner = new Scanner(System.in);
        // nhập a,b
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        // đóng scanner
        scanner.close();

        int sum = a + b;
        // xuất tổng
        System.out.printf("%d + %d = %d",a,b,sum);



    }
}
