import java.util.LinkedList;
import java.util.List;

public class FibFrog {

        public static void main(String[] args) {

            int[] A = {0,0,0,1,1,0,1,0,0,0,0,1};

            solution(A);

        }

        public static void solution(int[] array) {

            List<Integer> fibbs = new LinkedList<>();

            int fibbOne = 1;
            int fibbTwo = 1;
        int nextFibb = 1;

        fibbs.add(1);   // inserts the first element

        while(nextFibb <= array.length + 1) {
            nextFibb = fibbOne + fibbTwo;
            fibbs.add(0,nextFibb);
            fibbOne = fibbTwo;
            fibbTwo = nextFibb;
        }
        fibbs.remove(0);    // removes first wrong element

        System.out.println(fibbs);

        int jumpsToMake = array.length;
        if(jumpsToMake == fibbs.get(0)) System.out.println(1);

        int numOfSteps = 0;
        int position = 0;
        int jumpSpanIndex = jumpsToMake;

        System.out.println("jumps to make: " + jumpsToMake);

        while(position < array.length) {

            jumpSpanIndex = 0;
            while(array[position+fibbs.get(jumpSpanIndex)] == 0) {
                jumpSpanIndex++;
            }
            System.out.println("jumpspanindex: " + fibbs.get(jumpSpanIndex));

            position += fibbs.get(jumpSpanIndex);
        }

    }

}
