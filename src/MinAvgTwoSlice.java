import java.util.Arrays;

public class MinAvgTwoSlice {

    public static void main(String[] args) {

        int[] array = {4,2,2,5,1,5,8};
        int[] arrayRand = new int[20];

        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = (int)(Math.random()*20);
        }

        System.out.println(Arrays.toString(arrayRand));
        System.out.println(solution(arrayRand));
    }

    public static int solution(int[] A) {

        int minAvg = 100;
        int indexOfMinAvg = 0;

        int currentAvg = 0;

        // loop for 2
        for (int i = 0; i < A.length - 1; i++) {
            currentAvg = (A[i]+A[i+1])/2;
            if(currentAvg < minAvg) {
                minAvg = currentAvg;
                indexOfMinAvg = i;
            }
        }

        // loop for 3
        for (int i = 0; i < A.length - 2; i++) {
            currentAvg = (A[i]+A[i+1]+A[i+2])/3;
            if(currentAvg < minAvg) {
                minAvg = currentAvg;
                indexOfMinAvg = i;
            }
        }

        return indexOfMinAvg;
    }

}
