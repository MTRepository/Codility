import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {

        int[] array = {1,2,5,4,3,6,7,9};

        System.out.println(solution(array));

    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 1; i < A.length; i++) {
            if(A[i] != A[i-1] + 1) return 0;
        }

        return 1;

    }

}
