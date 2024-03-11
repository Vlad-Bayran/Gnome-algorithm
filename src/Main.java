import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int col = 1000;
        int arr1[] = new int[col];

        for (int i = 0; i < col; i++) {
            int r = random.nextInt(col);
            System.out.print(" " + r);
            arr1[i] = r;


        }
        System.out.println();

        for (int i = 0; i < col - 1;) {
            if (arr1[i] <= arr1[i + 1]) {
                i++;
            } else {
                int step = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = step;

                if (i > 0) {
                    i--;
                }
            }
        }

        for (int arr : arr1) {
            System.out.print(" " + arr);
        }

    }
}
