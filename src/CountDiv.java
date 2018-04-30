public class CountDiv {

    public static void main(String[] args) {

        int a = 6;
        int b = 17;
        int k = 2;

        System.out.println(solution(a,b,k));

    }

    public static int solution(int a, int b, int k) {

        int counter = (((b%k == 0) ? b - 1 : b) - ((a%k == 0) ? a + 1 : a)) / k;
        if(a%k == 0) counter++;
        if(b%k == 0) counter++;

        return counter;

    }

}
