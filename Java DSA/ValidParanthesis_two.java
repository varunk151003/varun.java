import java.util.*;

public class ValidParanthesis_two {
    
    public boolean isValidParanthesis(String s) {
    Stack<Character> st = new Stack<Character>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            st.push(c);
        } else if (c == ')') {
            if (st.isEmpty() || st.pop() != '(') {
                return false;
            }
        } else if (c == '}') {
            if (st.isEmpty() || st.pop() != '{') {
                return false;
            }
        } else if (c == ']') {
            if (st.isEmpty() || st.pop() != '[') {
                return false;
            }
        } else {
            return false;
        }
    }

    return st.isEmpty();
}

            

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ValidParanthesis_two solution = new ValidParanthesis_two();
        
        System.out.println(solution.isValidParanthesis(s));

        sc.close();
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}