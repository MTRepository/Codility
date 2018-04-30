public class CyclicRotation {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int key = 3;

        solution(array,key);

    }

    public static int[] solution(int[] A, int K) {

        int[] array = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            array[i] = A[(i - K + A.length)%A.length];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
