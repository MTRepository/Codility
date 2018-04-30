import javafx.scene.effect.SepiaTone;

import java.util.*;

public class Distinct {

    public static void main(String[] args) {

        int[] array = {1,4,5,3,2,3,5,4,3,5,1,3,4,5,7,8,5,6,4};

        System.out.println(solution(array));    // O(n log(n))
        System.out.println(solution2(array));    // O(n)

    }

    public static int solution(int[] A) {

        /*  The sorting algorithm is a Dual-Pivot Quicksort.
        This algorithm offers O(n log(n)) performance.*/
        Arrays.sort(A);

        List<Integer> list = new LinkedList<>();
        list.add(A[0]);

        for (int i = 1; i < A.length; i++) {
            if(A[i] != A[i-1]) list.add(A[i]);
        }

        System.out.println(list);

        return list.size();

    }

    public static int solution2(int[] A) {

        Set<Integer> verSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            verSet.add(A[i]);
        }

        return verSet.size();

    }

}
