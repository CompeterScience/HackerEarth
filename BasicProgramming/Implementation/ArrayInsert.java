import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int numQueries = scan.nextInt();
        
        int[] arrayA = new int[arraySize];
        for(int i=0; i<arraySize; i++) {
            int val = scan.nextInt();
            arrayA[i] = val;
        }
        
        for(int i=0; i<numQueries; i++) {
            int query = scan.nextInt();
            if(query == 1) {
                int idx = scan.nextInt();
                int val = scan.nextInt();
                arrayA[idx] = val;
            }
            if(query == 2) {
                int v0 = scan.nextInt();
                int v1 = scan.nextInt();
                try {
                    int sum = 0;
                    for(int j=v0; j<v1+1; j++) {
                        sum += arrayA[j];
                    }
                    System.out.println(sum);
                } catch (Exception e) {
                    System.out.println("-1");
                }
            }
        }
    }
}
