import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

        int[] leaves = {1,3,1,4,2,3,5,4};
        int distance = 5;

        System.out.println(solution(leaves,distance));

    }

    public static int solution(int[] A, int x) {

        Set<Integer> notFallenLeaves = new HashSet<>();
        for (int i = 1; i <= x; i++) {
            notFallenLeaves.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            if(notFallenLeaves.contains(A[i])) notFallenLeaves.remove(A[i]);
            if(notFallenLeaves.isEmpty()) return i;
        }

        return -1;
    }

}
