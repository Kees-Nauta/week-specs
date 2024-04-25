import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,4,5};
        int maxNum = 5;
        int missingNumber = MissingNumber.missingNumberSum(nums, maxNum);
        System.out.println("missing number :" + missingNumber);


        ArrayStack stack = new ArrayStack(5);

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        stack.printStack();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        stack.printStack();



        System.out.println(balancedPar("(()("));
    }


    public static boolean balancedPar(String string) {
        Stack<Character> stack = new Stack<>();

        for (char c : string.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}