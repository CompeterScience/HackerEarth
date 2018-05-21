import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size = Integer.valueOf( scan.nextLine() );
        int[] arr = new int[size];
        for (int i = size; i > 0; i--) {
            arr[i-1] = Integer.valueOf( scan.nextLine() );
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
