import java.util.*;

public class FibFrog {

    public static void main(String[] args) {

        int[] array = {0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0};

        System.out.println(solution(array));

    }

    public static int solution(int[] array) {

        Set<Integer> fibbs = new HashSet<>();

        int firstFibb = 1;
        int secondFibb = 1;
        int currFibb = 1;

        while (currFibb <= 100_000) {
            currFibb = firstFibb + secondFibb;
            fibbs.add(currFibb);
            firstFibb = secondFibb;
            secondFibb = currFibb;
        }

        List<Integer> list = new ArrayList<>();

        int counter = 0; // first element represents step one
        for (int i = array.length-1; i >=0; i--) {
            if(array[i] == 0) {
                counter++;
            }else if(array[i] == 1 && fibbs.contains(counter+1)) {
                list.add(++counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        list.add(counter + 1);

        for (int i = 0; i < list.size(); i++) {
            if(!fibbs.contains(list.get(i))) return -1;
        }

        for (int i = list.size()-1; i > 0; i--) {
            if(fibbs.contains(list.get(i) + list.get(i-1))) {
                list.set(i-1, list.get(i-1) + list.get(i));
                list.remove(i);
            }
        }

        return list.size();

    }


}
