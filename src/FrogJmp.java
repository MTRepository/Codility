public class FrogJmp {

    public static void main(String[] args) {

        int x = 10;
        int y = 85;
        int d = 30;

        System.out.println(solution(x,y,d));

    }

    public static int solution(int X, int Y, int D) {

        return (int)Math.ceil(((double)Y - X) / D);

    }
}
