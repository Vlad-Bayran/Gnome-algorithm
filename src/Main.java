import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int col = 20;
        int arr1 [] = new int[col];

        for (int i = 0; i < col; i++) {

            int r = random.nextInt(col);
            System.out.print(" " + r);

            arr1[i] = r;


        }
            System.out.println();

        for ( int arr : arr1){
            System.out.print(" " +arr);
        }

    }
}
