import java.util.Stack;

public class StoneWall {

    public static void main(String[] args) {

        int[] array = {8,8,5,9,8,7,4,8,6,4};

        System.out.println(solution(array));

    }

    public static int solution(int[] array) {

        Stack<Integer> stack = new Stack<>();

        int counter = 1;
        stack.push(0); // dummy value
        stack.push(array[0]);

        for (int i = 1; i < array.length; i++) {

            if(array[i] > array[i-1]) {
                stack.push(array[i]);
                counter++;
            } else if(array[i] < array[i-1]) {
                if(stack.search(array[i]) != -1) {
                    for (int j = 0; j < stack.search(array[i]); j++) {
                        stack.pop();
                    }
                } else {
                    while(stack.peek() > array[i]) {
                        stack.pop();
                    }
                    stack.push(array[i]);
                    counter++;
                }
            }
        }

        return counter;

    }

}
