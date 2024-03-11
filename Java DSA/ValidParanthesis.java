import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValidPattern(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                return false; 
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "((()()))";
        System.out.println(isValidPattern(str));
        str = "(()))(())";
        System.out.println(isValidPattern(str));
        str = ")";
        System.out.println(isValidPattern(str));
        str = "(";
        System.out.println(isValidPattern(str));
        str = ")))(((";
        System.out.println(isValidPattern(str));
    }
}
