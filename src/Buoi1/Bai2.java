package huytran;

public class Bai2 {
    public static void main(String[] args) {
        int x = 3;
        int a = 4;
        int b = 6;
        int c = 15;
        System.out.println(a * x * x + b * x + c);

        int month = 5;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.print("Thang co 31 ngay");
        } else { if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.print("Thang co 30 ngay");
        } else { if (month == 2) {
            System.out.print("Thang co 28 hoac 29 ngay");
        }}}
    }}
