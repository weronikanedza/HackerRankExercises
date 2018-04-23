import java.util.*;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        if(expression.length()%2!=0) return false;

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<expression.length();i++){
            if(!stack.empty() && getExpression(stack.peek())==expression.charAt(i))
                stack.pop();
            else
                stack.add(expression.charAt(i));
        }
        return stack.size()==0? true : false;
    }

    public static char getExpression(char bracket){
            if(bracket=='{') return '}';
            else if(bracket=='[') return ']';
            else if(bracket=='(') return ')';
            else return ' ';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}