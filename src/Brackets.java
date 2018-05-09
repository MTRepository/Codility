import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {

        String str = "{[[[(())()]]]}";

        System.out.println(solution(str));

    }

    Set<Integer> secik = new HashSet<>();

    public static int solution(String string) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if(string.substring(i,i+1).equals("{")) {
                stack.push("{");
            } else if(string.substring(i,i+1).equals("[")) {
                stack.push("[");
            } else if(string.substring(i,i+1).equals("(")) {
                stack.push("(");
            } else if(string.substring(i,i+1).equals("}") && stack.peek().equals("{")) {
                stack.pop();
            } else if(string.substring(i,i+1).equals("]") && stack.peek().equals("[")) {
                stack.pop();
            } else if(string.substring(i,i+1).equals(")") && stack.peek().equals("(")) {
                stack.pop();
            } else {
                return 0;
            }
        }

        return 1;

    }

}
