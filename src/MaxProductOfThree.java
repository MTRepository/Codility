import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {

        int[] arrayb = {-6,1,2,-9,5,4,10,6};

        System.out.println(solution(arrayb));    // O(n log(n))
        System.out.println(solution2(arrayb));   // O(n)

    }

    public static int solution(int[] A) {

        /*  The sorting algorithm is a Dual-Pivot Quicksort.
        This algorithm offers O(n log(n)) performance.*/

        Arrays.sort(A);

        System.out.println(Arrays.toString(A));

        return (A[0] * A[1] < A[A.length-2] * A[A.length-3])
                ? A[A.length-3] * A[A.length-2] * A[A.length-1]
                : A[0] * A[1] * A[A.length-1];

    }

    public static int solution2(int[] A) {

        int maxPosNum1 = 0;
        int maxPosNum2 = 0;
        int maxPosNum3 = 0;
        int maxNegNum = 0;
        int maxNegNum2 = 0;

        for (int i = 0; i < A.length; i++) {
            if(maxPosNum1 < A[i]) maxPosNum1 = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            if(maxPosNum2 < A[i] && A[i] < maxPosNum1) maxPosNum2 = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            if(maxPosNum3 < A[i] && A[i] < maxPosNum2) maxPosNum3 = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            if(maxNegNum > A[i]) maxNegNum = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            if(maxNegNum2 > A[i] && A[i] > maxNegNum) maxNegNum2 = A[i];
        }

        return (maxNegNum * maxNegNum2 < maxPosNum2 * maxPosNum3)
                ? maxPosNum2 * maxPosNum3 *maxPosNum1
                : maxNegNum * maxNegNum2 *maxPosNum1;

    }

}
