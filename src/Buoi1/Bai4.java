package huytran;

public class Bai4 {
    public static void main(String[] args) {
        int[] Array = {4,2,7,9,1,5};
        int smallest = Array[0];

        for(int i = 0; i < Array.length; i++){
            if (Array[i]<smallest) smallest = Array[i];
        } System.out.println(smallest);
    }
}
