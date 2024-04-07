public class CombinedTriangles1 {

    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int k = i; k < rows; k++) {
                System.out.print("\t");
            }

            for (int l = rows - i + 1; l > 0; l--) {
                System.out.print("* ");
            }

            for (int m = rows - i; m > 0; m--) {
                System.out.print("\t");
            }

            for (int n = rows - i + 1; n > 0; n--) {
                System.out.print("* ");
            }

            for (int p = i; p < rows; p++) {
                System.out.print("\t");
            }

            for (int q = 1; q <= i; q++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
