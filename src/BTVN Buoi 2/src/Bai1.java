public class Bai1 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 15, 25, 35, 40};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                a = a + arr[i];
            }
        }
        System.out.print(a);
    }
}
