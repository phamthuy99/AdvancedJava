package java_day1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        //amDuong();
        //chanLe();
        //nam_nhuan();
        //so_cp();
        //pt_bac_nhat();
        //switch_case();
        //kiem_tra_cung_dau();
        //tim_so_ln();
        tinh_tam_giac();

    }

    public static void amDuong(){
        // nhập số nguyên x từ bàn phím , in ra x là số âm hay dương
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập x = ");
        x = scanner.nextInt();
        scanner.close();

        if (x > 0){
            System.out.printf( x + " là số nguyên dương");
        }else if (x < 0){
            System.out.printf( x + " là số nguyên âm");
        }else {
            System.out.printf( x + " là số không âm không dương");
        }
    }
    public static void chanLe(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập n = ");
        n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0){
            System.out.printf("n là số chẵn");
        }

        if (n % 2 != 0){
            System.out.printf("n là số lẻ");
        }
    }

    public static void nam_nhuan(){
        // Gregorius
        // Input : >= 1582 -> trước mốc thời gian này ko xét
        // Năm nhuận: x % 400 == 0 || ( (x % 4== 0) && (x % 100 != 0) )

        // Bước 1: Nhập năm
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int x= in.nextInt();
        in.close();
        // Bước 2: Kiểm tra
        if(x < 1582){
            System.out.println("Không xác định!");
            System.exit(0);
        }
        if(x % 400 == 0 || (x % 4 == 0 && x % 100 != 0)){
            System.out.println("Là năm nhuận!");
            System.exit(0);
        }
        System.out.println("Không nhuận");
    }

    public static void pt_bac_nhat(){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = scanner.nextInt();
        System.out.print("Nhập b: ");
        b = scanner.nextInt();
        scanner.close();

        if (a == 0){
            if (b == 0){
                System.out.printf("pt vô số nghiệm");
                System.exit(0);
            }
            System.out.printf("pt vô nghiệm");
        }

        if (a != 0){
            int x = -b/a;
            System.out.printf("pt có nghiệm là : " + x);
            System.exit(0);
        }

    }

    public static void so_cp(){
        System.out.print("Nhập x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();

        double sqrt = Math.sqrt(x);
        int sqrtInt = (int) sqrt;
        if (sqrtInt == sqrt){
            System.out.printf(x + " là số chính phương");
        }else {
            System.out.printf(x + " không phải là số chính phương");
        }
    }

    public static void switch_case(){

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int x = in.nextInt();
        System.out.print("Nhập năm: ");
        int y = in.nextInt();
        in.close();
        if(x < 1 || x > 12 || y < 1582){
            System.out.println("Tháng không hợp lệ!");
            System.exit(0);
        }
        switch (x){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
                    System.out.println("Có 29 ngày");
                    System.exit(0);
                }
                System.out.println("Có 28 ngày");
                break;
            default:
                System.out.println("Có 31 ngày!");
                break;
        }

    }

    public static void kiem_tra_cung_dau (){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = in.nextInt();
        System.out.print("Nhập y: ");
        int y = in.nextInt();

        if (x * y > 0){
            System.out.printf("cùng dấu");
        }else if (x * y < 0){
            System.out.printf("khác dấu");
        }
    }

    public static void tim_so_ln(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = in.nextInt();
        System.out.print("Nhập y: ");
        int y = in.nextInt();
        System.out.print("Nhập z: ");
        int z = in.nextInt();

        in.close();

        if (x > y && x > z){
            System.out.printf(x + " là số ln");
        }else if (y > z){
            System.out.printf(y + " là số ln");
        }
        System.out.printf(z + " là số ln");

    }

    public static void tinh_tam_giac(){

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

        //81 + 82 + 96 + 97 + 98;

    }
}
