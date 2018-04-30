import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {

        int[] array = {1,1,4,4,6,4,4,9,9};

        System.out.println(solution(array));

    }

    public static int solution(int[] A) {

        String list = Arrays.toString(A).replaceAll("\\D","");
        System.out.println(list);

        for (int i = 0; i < list.length(); i++) {
            if((list.length() - list.replaceAll(list.substring(i,i+1),"").length())%2 != 0) {
                return Integer.parseInt(list.substring(i,i+1));
            }
        }

        return 0;
    }
}
