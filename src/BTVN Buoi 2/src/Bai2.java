public class Bai2 {
    public static void main(String[] args) {
        int a = 4561234;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.print(sum);
    }
}
