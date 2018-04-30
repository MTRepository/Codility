import java.util.Arrays;

public class NumberOfDiscIntersections {

    public static void main(String[] args) {

        int[] array = {1,5,2,1,4,0,7};   // O(n)

        System.out.println(solution(array));

    }

    public static int solution(int[] array) {

        int minRange = 0;
        for (int i = 0; i < array.length; i++) {
            if(minRange > i - array[i]) minRange = i - array[i];
        }

        int maxRange = 0;
        for (int i = 0; i < array.length; i++) {
            if(maxRange < i + array[i]) maxRange = i + array[i];
        }

        // 2 - openIndex, closeIndex
        int[][] arrayOps = new int[maxRange-minRange+1][2];
        int offset = Math.abs(minRange);

        for (int i = 0; i < array.length; i++) {
            int left = i - array[i] + offset;
            arrayOps[left][0] += 1;
            int right = i + array[i] + offset;
            arrayOps[right][1] += 1;
        }

        int counter = 0;
        int circleCounter = 0;

        for (int i = 0; i < arrayOps.length; i++) {
            if(counter == 0 && arrayOps[i][0] > 0) {
                counter++;
                arrayOps[i][0]--;
            }

            if(counter != 0 && arrayOps[i][0] > 0) {
                for (int j = 0; j < arrayOps[i][0]; j++) {
                    circleCounter += counter;
                    counter++;
                }
            }

            if(arrayOps[i][1] > 0) {
                counter -= arrayOps[i][1];
            }

        }

        return circleCounter;
    }

}
