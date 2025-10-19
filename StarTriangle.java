public class StarTriangle {
    public static void main(String[] args) {
        int rows = 5; // You take another no. 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

          
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}
