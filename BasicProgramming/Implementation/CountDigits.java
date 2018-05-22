import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        int[] nums = new int[10];
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("");
        while( scan.hasNext() ) {
            String str = scan.next();
            int num = Integer.valueOf(str);
            nums[num]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println( i +" "+ nums[i]);
        }
    }
}
