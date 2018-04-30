import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static void main(String[] args) {

        //int[] array = {1,2,3,-1,-5,5,5,12,15,1,3,6};

        // random numbers
        int[] array = new int[1000];
        int missing = 37;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(100*Math.random());
            if(array[i] == missing) array[i] += 7;
        }

        System.out.println(solution(array));

    }

    public static int solution(int[] A) {

        Set<Integer> store = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            store.add(A[i]);
        }

        System.out.println(store);

        int verifier = 1;
        while(store.contains(verifier)) {
            verifier++;
        }

        return verifier;

    }

}
