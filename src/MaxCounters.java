import java.util.Arrays;


public class MaxCounters {

    public static void main(String[] args) {

        int[] array ={3,4,4,6,1,4,4};
        int num = 5;

        System.out.println(Arrays.toString(solution(num,array)));

    }

    public static int[] solution(int num, int[] A) {

        int[] modifiedArray = new int[num];

        int floor = 0;
        int counter = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] <= num) {
                modifiedArray[A[i]-1] = (modifiedArray[A[i]-1] >= floor) ? modifiedArray[A[i]-1] + 1 : floor + 1;
                if(modifiedArray[A[i]-1] - floor > counter) counter = modifiedArray[A[i]-1] - floor;

            } else {

                floor = floor + counter;
                counter = 0;
            }
        }

        for (int i = 0; i < num; i++) {
            modifiedArray[i] = (modifiedArray[i] >= floor) ? modifiedArray[i] : floor;
        }

        return modifiedArray;
    }


}
