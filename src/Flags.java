import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Flags {

    public static void main(String[] args) {

        int[] array = {1,5,3,4,3,4,1,2,3,4,6,2};

        System.out.println(solution(array));
    }

    public static int solution(int[] arr) {

        Queue<Integer> peaks = new LinkedList<>();

        int currentPosition = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                peaks.add(i-currentPosition);
                currentPosition = i;
            }
        }

        if(peaks.size() == 1) return peaks.peek();

        System.out.println(peaks);

        int temp = 0;

        for (int i = 1; i < peaks.size(); i++) {
            int peakCounter = 1;

            Queue<Integer> current = new LinkedList<>(peaks);
            current.remove();

            for (int j = 0; j < current.size(); j++) {
                temp += current.poll();
                if(temp >= i) {
                    peakCounter++;
                    temp = 0;
                }
            }

            if(peakCounter < i) return i;
        }
        return 1;
    }

}
