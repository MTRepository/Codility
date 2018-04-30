import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {

        int[] array = {1,4,3,5,2,8,10,6,9,7,11,13};

        System.out.println(solution(array));

    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 1; i < A.length; i++) {
            if(A[i] != A[i-1] + 1) return A[i] - 1;
        }

        return 0;
    }

}
