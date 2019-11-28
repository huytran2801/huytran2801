package huytran;

public class bai3 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            } i++;
        } while (i <= 100);

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int j = 9;
        int k = 10;
        for(int number = 1; number <= 10; number++){
            System.out.println(number*a);
            System.out.println(number*b);
            System.out.println(number*c);
            System.out.println(number*d);
            System.out.println(number*e);
            System.out.println(number*f);
            System.out.println(number*g);
            System.out.println(number*h);
            System.out.println(number*j);
            System.out.println(number*k);
        }

        int songuyento = 5;
        int dem = 0;
        for (int m = 1; m <= songuyento; m++) {
            if (songuyento % m == 0){
                dem++;
            }
        }
        if (dem == 2){
            System.out.println("So nguyen to");
        }else { System.out.println("Khong phai so nguyen to");}
    }
}
