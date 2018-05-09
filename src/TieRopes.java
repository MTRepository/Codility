import java.util.Arrays;

public class TieRopes {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,1,1,3,2,3};
        int key = 4;

        System.out.println(solution(array,key));

    }

    public static int solution(int[] array, int key) {

        int ropeCounter = 0;
        int temp = 0;
        if(array[0] >= key) ropeCounter++;

        for (int i = 1; i < array.length; i++) {

            if(array[i] >= key) {
                ropeCounter++;
            } else if(array[i] < key && array[i-1] < key && array[i-1] + array[i] >= key) {
                ropeCounter++;
                array[i] = 0;
            }

        }

        return ropeCounter;

    }

}
