public class TapeEquilibrium {

    public static void main(String[] args) {

        int[] array = {3,1,2,4,3};

        System.out.println(solution(array));

    }

    public static int solution(int[] A) {

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        int sumLeft = 0;
        int counter = 100;
        for (int i = 1; i < A.length; i++) {
            sumLeft += A[i-1];
            if(Math.abs(sumLeft - sum + sumLeft) < counter) counter = Math.abs(sumLeft - sum + sumLeft);
        }
        return counter;

    }

}
