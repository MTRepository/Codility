public class BinaryGap {

    public static void main(String[] args) {

        System.out.println(solution(2232388));

    }

    public static int solution(int n) {

        String checkedString = Integer.toString(n,2).replaceAll("0*$","");

        if(checkedString.length() == checkedString.replaceAll("0","").length()) return 0;

        int counter = 0;

        while (checkedString.contains("0")) {

            int current = checkedString.length() - checkedString.replaceFirst("0+","").length();
            if(current > counter) counter = current;
            checkedString = checkedString.replaceFirst("0+","");

        }

        return counter;

    }

}
